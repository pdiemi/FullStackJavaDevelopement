package exceptions;

public class UserChoiceIsInvalidException extends CustomException{

	public UserChoiceIsInvalidException() {
		super();
	}

	public UserChoiceIsInvalidException(String exceptionId) {
		super(exceptionId);
	}

}
