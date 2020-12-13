package exceptions;

public class FileNameIsTooLong extends CustomException{

	public FileNameIsTooLong() {
		super();
	}

	public FileNameIsTooLong(String exceptionId) {
		super(exceptionId);
	}

}
