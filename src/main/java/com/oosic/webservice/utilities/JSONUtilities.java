package com.oosic.webservice.utilities;


import org.json.JSONException;
import org.json.JSONObject;

import com.oosic.webservice.errors.SpringTemplateException;

public class JSONUtilities {
	public static JSONObject getErrorJSON(SpringTemplateException ex) {
		try {
			JSONObject json = new JSONObject();
			json.put("errorCode", ex.getErrorCode());
			json.put("errorMessage", ex.getMessage());
			return json;
		} catch (JSONException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
