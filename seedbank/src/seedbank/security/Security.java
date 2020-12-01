package seedbank.security;

import seedbank.account.*;
import seedbank.customer.*;
import seedbank.exception.*;

/**
* This class contains methods that authorizes
* a customer for a transaction
*/
public class Security {
	
	/**
	* This method authorizes a customer to
	* perform a particular transaction
	* @param account the account in the Seed Bank
	* @param customer the customer of the Seed bank
	* @throws UnAuthorizedWithdrawTransactionException This
	* exception is thrown if the account does not
	* belong to the customer
	*/
	public void authorization(Account account,Customer customer)
			throws UnAuthorizedWithdrawTransactionException{
		/*
		* Testing if the customerId of the account and the
		* customerId of the customer to whom the account belongs
		* to are the same
		*/
		if(account.getCustomer().getCustomerId()!=customer.getCustomerId()){
			/* Throwing an exception if the customer Id's doesn't
			* match
			*/
			throw new UnAuthorizedWithdrawTransactionException();
		}
	}
}
