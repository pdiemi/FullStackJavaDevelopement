package exceptions;

public class FileNameIsNotFoundException extends CustomException{

	public FileNameIsNotFoundException() {
		super();
	}

	public FileNameIsNotFoundException(String exceptionId) {
		super(exceptionId);
	}

}
