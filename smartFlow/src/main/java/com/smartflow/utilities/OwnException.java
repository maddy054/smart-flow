package com.smartflow.utilities;

import com.smartflow.enums.ErrorCode;

public class OwnException extends Exception{

	private static final long serialVersionUID = 1L;
	private	ErrorCode errorCode;
		
	public OwnException(String message) {
		super(message);
	}
	public OwnException(String message,	Exception e) {
		super(message,e); 
	}
	
	public OwnException(ErrorCode errorCode) {
		this.errorCode = errorCode;
	}
	
	public  ErrorCode getErrorCode() {
		return errorCode;
	}
}
