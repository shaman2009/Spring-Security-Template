package com.oosic.webservice.constants;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;




/**
 * Constants list
 * 
 * @author shen_yi
 */
public class SpringTemplateContants {
	public static final String API_SECRET = "8mvu53w7el4cizp20el1mq2zc4pocvub";
	
	public static final String ANONYMOUS_ACCOUNT_PREFIX = "_Anonymous";
	
	public static final long FORGET_PASSWORD_TOKEN_EXPIRE = 48 * 60 * 60 * 1000L;//48 hr
	
	public static final long ONE_DAY = 24 * 60 * 60 * 1000L;//12 hr
	
	public static final long QUCIK_MAKE_FRIENDS_IN_GROUP_EXPIRE = 12 * 60 * 60 * 1000L;//12 hr
	
	public static final long QUCIK_MAKE_FRIENDS_IN_GROUP_NO_LIMIT = 24 * 60 * 60 * 3650 * 1000L;//10 year
	
	
	public static final Long MAX_COUNT_ID = 999999999999999999l;
	
	public static final String DEFAULT_GROUP_NAME_FRIEND = "朋友";
	public static final String DEFAULT_GROUP_NAME_FAMILY = "家庭";
	
	
	public static final String IMAGE_URL = getImageUrlProperties().getProperty("image.url");
	//38DEBUG
//	public static final String Redis_URL = "10.135.63.38";
//	public static final String IMAGE_URL = "http://180.168.145.238:38211/";
	
	public static final int INCSURF_IMG_PATH = 0;
	public static final int CHAT_IMG_PATH = 1;
	
	
	public static final String UPLOAD_INCSURF_URL = "/var/www/html/incsurf-img/";
	public static final String UPLOAD_CHAT_IMG_URL = "/var/www/html/chat-img/";
	public static final String UPLOAD_PRESENT_URL = "/var/www/html/present-img/";
	public static final String UPLOAD_BACKGROUND_URL = "/var/www/html/incsurf-userbackground-img/";
	public static final String REPLACE_URL = "/var/www/html/";
	
	
	public static final String INCSURF_PUBLIC_ACCOUNT = "91946674-7735-4aa8-b590-54fe40080fa7";  //密码 a3d20196c97a1f4b63df867a0157b68b
	
	public static final String FACEBOOK_LOGIN = "FACEBOOK";
	public static final String WEIBO_LOGIN = "WEIBO";
	
	public static Properties getImageUrlProperties() {
		Properties pro = new Properties();
		InputStream in = SpringTemplateContants.class.getClassLoader().getResourceAsStream(
				"uploadfile.properties");
		try {
			pro.load(in);
		} catch (IOException e) {
		}
		return pro;
	}
	
}
