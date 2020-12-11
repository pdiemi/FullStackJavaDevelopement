package com.examples.framework.exception;

public class EmptyReportException extends AppException {
	public EmptyReportException() {
		super();
	}
	
	public EmptyReportException(String exceptionId) {
		super(exceptionId);
	}
}
