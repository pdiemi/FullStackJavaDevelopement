package exceptions;

public class UserChoiceIsInvalid extends CustomException{

	public UserChoiceIsInvalid() {
		super();
	}

	public UserChoiceIsInvalid(String exceptionId) {
		super(exceptionId);
	}

}
