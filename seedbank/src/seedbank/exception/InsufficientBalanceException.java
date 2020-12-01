package seedbank.exception;

/**
* This exception class is thrown if the account has 
* insufficient balance in the account for the transaction
*/
public class InsufficientBalanceException extends Exception {
	/**
	* The default constructor for the class
	*/
	public InsufficientBalanceException(){
		//calling the parent constructor 
		super("Insufficient Balance in the account");
	}
}

