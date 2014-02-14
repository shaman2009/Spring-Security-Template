package com.oosic.webservice.errors;

import java.util.Date;



/**
 * The errors specifically defined by libOoPassAccount.
 * @author shen_yi
 *
 */
public class SpringTemplateAccountErrors extends SpringTemplateErrors {

	public static void main(String[] args) {
		Date d = new Date(1377141555000L);
		System.out.println(d);
	}
	public static final int EMAIL_INVALID_CODE = 111;
	public static final String EMAIL_INVALID_MESSAGE = "email invalid";

	public static final int PASSWORD_INVALID_CODE = 112;
	public static final String PASSWORD_INVALID_MESSAGE = "password invalid";

	public static final int EMAIL_PASSWORD_WRONG_CODE = 100;
	public static final String EMAIL_PASSWORD_WRONG_MESSAGE = "email or password is wrong";
	
	public static final int EMAIL_WRONG_CODE = 101;
	public static final String EMAIL_WRONG_MESSAGE = "email is wrong or email is not exit";
	
	public static final int USER_OPERATION_FORBIDDEN_WRONG_CODE = 102;
	public static final String USER_OPERATION_FORBIDDEN_WRONG_MESSAGE = "user operation forbidden";
	
	public static final int EMAIL_DUPLICATED_CODE = 110;
	public static final String EMAIL_DUPLICATED_MESSAGE = "email duplicated";
	
	public static final int ALIAS_DUPLICATED_CODE = 113;
	public static final String ALIAS_DUPLICATED_MESSAGE = "alias duplicated";
	
	public static final int UPLOAD_FILE_DENIED_CODE = 155;
	public static final String UPLOAD_FILE_DENIED_MESSAGE = "upload file denied";
	
	public static final int FILE_DOESNT_EXSIT_CODE = 156;
	public static final String FILE_DOESNT_EXSIT_MESSAGE = "file doesn't exsit";
	
	public static final int CANT_READ_FILE_CODE = 157;
	public static final String CANT_READ_FILE_MESSAGE = "can't read file";
	
	public static final int INVALID_AVATAR_ID_CODE = 120;
	public static final String INVALID_AVATAR_ID_MESSAGE = "invalid default avatar ID";
	
	public static final int USER_NOT_FOUND_CODE = 121;
	public static final String USER_NOT_FOUND_MESSAGE = "user not found";
	
	public static final int GROUP_NOT_FOUND_CODE = 122;
	public static final String GROUP_NOT_FOUND_MESSAGE = "group not found";
	
	public static final int FORGET_PASSWORD_TOKEN_NOT_FOUND = 161;
	public static final String FORGET_PASSWORD_TOKEN_NOT_FOUND_MESSAGE = "invalid forget password token";
	
	public static final int FORGET_PASSWORD_TOKEN_EXPIRED = 162;
	public static final String FORGET_PASSWORD_TOKEN_EXPIRED_MESSAGE = "token expired";
	
	public static final int PUSHID_NOT_FOUND_CODE = 123;
	public static final String PUSHID_NOT_FOUND_MESSAGE = "push ID not found";
	
	public static final int REGISTER_FAILED_CODE = 119;
	public static final String REGISTER_FAILED_MESSAGE = "registration failed";
	
	public static final int CONFIG_NEED_MERGE_CODE = 131;
	public static final String CONFIG_NEED_MERGE_MESSAGE = "client config needs merge.";
	
	public static final int IS_NOT_FRIEND_CODE = 133;
	public static final String IS_NOT_FRIEND_MESSAGE = "you are not friends yet";
	
	public static final int NO_FEED_ID_CODE = 134;
	public static final String NO_FEED_ID_MESSAGE = "feed ID not found";

	public static final int EMAIL_SEND_ERROR_CODE = 135;
	public static final String EMAIL_SEND_ERROR_MESSAGE = "email send error";
	
	public static final int USER_NOT_IN_THE_MEETING_CODE = 334;
	public static final String USER_NOT_IN_THE_MEETING_MESSAGE = "user is not in the meeting";
	
	public static final int USER_GROUP_NULL_CODE = 335;
	public static final String USER_GROUP_NULL_MESSAGE = "user group is null";
	
	public static final int ADD_GROUP_ERROR_CODE = 336;
	public static final String ADD_GROUP_ERROR_MESSAGE = "you can not add yourself into one group";
	
	public static final int GROUP_NAME_DUPLICATED_CODE = 337;
	public static final String GROUP_NAME_DUPLICATED_MESSAGE = "group name duplicated";
	
	public static final int CREATE_GROUP_ERROR_CODE = 338;
	public static final String CREATE_GROUP_ERROR_MESSAGE = "group exist";
	
	public static final int EDIT_GROUP_ERROR_CODE = 339;
	public static final String EDIT_GROUP_ERROR_MESSAGE = "groupid is wrong";
	
	
	public static final int MAKE_FRIEND_GROUP_ID_DUPLICATED_CODE = 1237;
	public static final String MAKE_FRIEND_GROUP_ID_DUPLICATED_MESSAGE = "make friend group id duplicated";
	
	public static final int MAKE_FRIEND_GROUP_ID_NOT_FOUND_CODE = 1238;
	public static final String MAKE_FRIEND_GROUP_ID_NOT_FOUND_MESSAGE = "make friend group id not found";
	
	public static final int MAKE_FRIEND_GROUP_NULL_CODE = 1239;
	public static final String MAKE_FRIEND_GROUP_NULL_MESSAGE = "make friend group is null";

	public static final int GROUP_EXPIRED_CODE = 1240;
	public static final String GROUP_EXPIRED_MESSAGE = "group expired or deleted";
	
	public static final int EDIT_GROUP_EXPIRED_AUTH_WRONG_CODE = 1241;
	public static final String EDIT_GROUP_EXPIRED_AUTH_WRONG_MESSAGE = "only user created the group could edit";
	
	
	public static final int IS_NOT_GROUP_MEMBER_CODE = 1250;
	public static final String IS_NOT_GROUP_MEMBER_MESSAGE = "only group member could update group info";
	
	public static final int IS_NOT_GROUP_ADMINISTRATION_CODE = 1251;
	public static final String IS_NOT_GROUP_ADMINISTRATION_MESSAGE = "only group administration could remove group members";
	
	public static final int GROUP_ID_NOT_EXIST_CODE = 1252;
	public static final String GROUP_ID_NOT_EXIST_MESSAGE = "group id is wrong";
	
	public static final int UPLOAD_IMAGE_CODE_NOT_EXIST_CODE = 1260;
	public static final String UPLOAD_IMAGE_CODE_NOT_EXIST_MESSAGE = "upload image code not exist";
	
	public static final int ACCOUNTTYPE_WRONG_CODE = 1270;
	public static final String ACCOUNTTYPE_WRONG_MESSAGE = "account type not found";
	
	public static final int ACCOUNTID_EXIST_CODE = 1275;
	public static final String ACCOUNTID_EXIST_MESSAGE = "account id exist";
}
