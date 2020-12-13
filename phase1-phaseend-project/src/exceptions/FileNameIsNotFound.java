package exceptions;

public class FileNameIsNotFound extends CustomException{

	public FileNameIsNotFound() {
		super();
	}

	public FileNameIsNotFound(String exceptionId) {
		super(exceptionId);
	}

}
