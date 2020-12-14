package exceptions;

public class FileNameIsTooLongException extends CustomException{

	public FileNameIsTooLongException() {
		super();
	}

	public FileNameIsTooLongException(String exceptionId) {
		super(exceptionId);
	}

}
