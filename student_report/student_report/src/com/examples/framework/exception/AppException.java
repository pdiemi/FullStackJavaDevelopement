package com.examples.framework.exception;

public class AppException extends Exception {
	private String exceptionId;
	
	public AppException() {
		this.exceptionId = null;
	}

	public AppException(String exceptionId) {
		this.exceptionId = exceptionId;
	}
}
