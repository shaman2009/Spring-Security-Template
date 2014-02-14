package com.oosic.webservice.errors;


/**
 * The exception used in the OOPass library. It uses an error code and a message
 * to indicate an error. The error codes are defined in file "ErrorCode".
 * 
 * @author shen_yi
 */
public class SpringTemplateException extends Exception {
	private static final long serialVersionUID = 8615689942272126971L;

	/**
	 * Constructor for OOPassException.
	 * 
	 * @param errorCode
	 */
	public SpringTemplateException(int errorCode) {
		super("");
		this.errorCode = errorCode;
	}

	public SpringTemplateException(int errorCode, String message) {
		super(message);
		this.errorCode = errorCode;
	}

	public SpringTemplateException(int errorCode, String message, Throwable cause) {
		super(message, cause);
		this.errorCode = errorCode;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public Throwable getCause() {
		return super.getCause();
	}

	private int errorCode;
}
