package exceptions;

public class FileNameIsNullException extends CustomException{

	public FileNameIsNullException() {
		super();
	}

	public FileNameIsNullException(String exceptionId) {
		super(exceptionId);
	}
	
}
