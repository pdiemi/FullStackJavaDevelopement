package com.examples.framework.exception;

public class UnableToSaveReportException extends AppException {
	public UnableToSaveReportException() {
		super();
	}
	
	public UnableToSaveReportException(String exceptionId) {
		super(exceptionId);
	}
}
