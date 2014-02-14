package com.oosic.webservice.errors;


/**
 * Indicates a remote method execution failed. 
 * @author yuchen
 *
 */
public class RemoteMethodException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1681382508362695834L;
	
	public RemoteMethodException(String message){
		super(message);
	}
}
