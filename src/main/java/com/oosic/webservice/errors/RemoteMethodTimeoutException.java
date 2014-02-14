package com.oosic.webservice.errors;


public class RemoteMethodTimeoutException  extends RemoteMethodException{

	private static final long serialVersionUID = -6662151041862773927L;
	
	public RemoteMethodTimeoutException(String message){
		super(message);
	}
}
