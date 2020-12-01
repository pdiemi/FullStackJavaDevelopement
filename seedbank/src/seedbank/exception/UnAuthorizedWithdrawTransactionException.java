package seedbank.exception;

/**
* This exception is thrown when the unauthorized 
* transaction is done.
*/
public class UnAuthorizedWithdrawTransactionException extends Exception {
	/**
	* This the default constructor for the
	* UnAuthorizedWithdrawTransactionException class.
	*/
	public UnAuthorizedWithdrawTransactionException() {
		//calling the super class constructor
		super("The user is unauthorized for the withdrawal");
	}
}

