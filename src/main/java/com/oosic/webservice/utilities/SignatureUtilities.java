package com.oosic.webservice.utilities;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

import com.oosic.webservice.constants.SpringTemplateContants;

public class SignatureUtilities {

	public static boolean checkCommonSignature(JSONObject json, String apiSecret) {
		try {
			StringBuffer buffer = new StringBuffer();
			buffer.append(apiSecret);
			String signature = null;

			List<Parameter> arrayList = new ArrayList<Parameter>();
			for (@SuppressWarnings("unchecked")
			Iterator<String> iter = json.keys(); iter.hasNext();) {
				String key = iter.next();
				if (key.equals("signature")) {
					signature = String.valueOf(json.get(key));
					continue;
				}
				Object value = json.get(key);
				arrayList.add(new Parameter(key, value));
			}
			if (signature == null)
				return false;
			Collections.sort(arrayList, new Comparator<Parameter>() {
				public int compare(Parameter object1, Parameter object2) {
					return object1.getName().compareTo(object2.getName());
				}
			});
			for (Parameter entry : arrayList) {
				buffer.append(entry.getName() + String.valueOf(entry.getValue()));
			}
			MessageDigest md = MessageDigest.getInstance("MD5");
			String expected_sig = ByteUtilities.toHexString(md.digest(buffer.toString().getBytes("UTF-8")));
			return expected_sig.equals(signature);
		} catch (JSONException e) {
			throw new RuntimeException(e);
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		} catch (UnsupportedEncodingException u) {
			throw new RuntimeException(u);
		}
	}

	public static boolean checkAuthorizedSignature(JSONObject json,
			String apiSecret, String actualSkey) {
		try {
			StringBuffer buffer = new StringBuffer();
			buffer.append(actualSkey);
			buffer.append(apiSecret);
			String signature = null;

			List<Parameter> arrayList = new ArrayList<Parameter>();
			for (@SuppressWarnings("unchecked")
			Iterator<String> iter = json.keys(); iter.hasNext();) {
				String key = iter.next();
				if (key.equals("signature")) {
					signature = String.valueOf(json.get(key));
					continue;
				}
				Object value = json.get(key);
				arrayList.add(new Parameter(key, value));
			}
			if (signature == null)
				return false;
			Collections.sort(arrayList, new Comparator<Parameter>() {
				public int compare(Parameter object1, Parameter object2) {
					return object1.getName().compareTo(object2.getName());
				}
			});

			for (Parameter entry : arrayList) {
				buffer.append(entry.getName() + String.valueOf(entry.getValue()));
			}

			MessageDigest md = MessageDigest.getInstance("MD5");
			String expected_sig = ByteUtilities.toHexString(md.digest(buffer.toString().getBytes("UTF-8")));
			return expected_sig.equals(signature);
		} catch (JSONException e) {
			throw new RuntimeException(e);
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		} catch (UnsupportedEncodingException u) {
			throw new RuntimeException(u);
		}
	}

	public static boolean checkCommonSignature(JSONObject json) {
		return checkCommonSignature(json, SpringTemplateContants.API_SECRET);
	}

	public static boolean checkAuthorizedSignature(JSONObject json, String actualSkey) {
		return checkAuthorizedSignature(json, SpringTemplateContants.API_SECRET, actualSkey);
	}
}
