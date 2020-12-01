package seedbank.transaction;

import seedbank.account.*;

/**
* This class contains methods for depositing the amount 
* into an account. 
*/
public class DepositTransaction extends Thread{
	/*
	* The transaction id of the transaction
	*/
	private int transactionId;
	/*
	* The account of which the depositing is done
	*/
	private Account account;
	/*
	* The amount for depositing
	*/
	private double amount;
	/*
	* The customer id of the customer depositing the amount
	*/
	private int customerId;
	
	/**
	*The parameterized constructor for initializing the object
	* @param transactionId the transaction id for the transaction
	* @param account the account to which the amount has to be
	* deposited
	* @param customerId the customer id of the customer depositing
	* the amount
	* @param amount The amount of deposit
	*/
	public DepositTransaction(int transactionId,Account account,int customerId,double amount) {
		this.transactionId=transactionId;
		this.account=account;
		this.customerId=customerId;
		this.amount=amount;
	}

	/**
	* This method deposits the amount into the given Account
	* @param account the account to which the amount has 
	* to be deposited
	* @param amount the amount to be deposited
	* @return the remaining balance in the account
	*/
	public void deposit(Account account,double amount){
		//depositing the amount 
		account.setBalance((account.getBalance()+amount));
	}
	
	/**
	* This method contains job for the thread
	*/
	public void run(){
		//depositing the amount 
		deposit(account, amount);
		//displaying the success message
		System.out.println(transactionId+" transaction "+ "completed!!!"+
							customerId +" thank you for "+"depositing to the Account "+
							account.getAccountNo());
	}
}
