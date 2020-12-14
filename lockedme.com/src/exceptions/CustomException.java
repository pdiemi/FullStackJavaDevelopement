package exceptions;

public class CustomException extends Exception {
	private String exceptionId;
	
	public CustomException() {
		this.exceptionId = null;
	}

	public CustomException(String exceptionId) {
		this.exceptionId = exceptionId;
	}
}
