package seedbank.transaction;

import seedbank.account.*;
import seedbank.customer.*;
import seedbank.exception.*;
import seedbank.security.*;

/**
* This class is used to perform the withdrawal
* transaction in the Seed Bank
*/
public class WithdrawTransaction extends Security implements Runnable{
	
	/*
	* The transaction id of the transaction
	*/
	private int transactionId;
	/*
	* The account from which the amount must be drawn
	*/
	private Account account;
	/*
	* The customer who is doing the transaction
	*/
	private Customer customer;
	/*
	* The amount of withdrawal
	*/
	private double amount;

	/**
	* The parameterized constructor is use to initialize the object
	* @param transactionId the transaction id of the transaction
	* @param account the account on which the transaction is done
	* @param customer the customer who is doing the transaction
	* @param amount the amount of withdrawal
	*/
	public WithdrawTransaction(int transactionId,Account account,Customer customer,double amount){
		this.transactionId=transactionId;
		this.account=account;
		this.customer=customer;
		this.amount=amount;
	}
	/**
	* This method does the withdrawal from the account
	* @param account the account from which the withdrawal 
	* has to be done
	* @param amount the amount that has to be withdrawn
	* @return the remaining balance in the account
	* @throws InsufficientBalanceException This exception is thrown
	* if there is insufficient balance in the account
	*/
	public double withdraw(Account account,double amount) 
			throws InsufficientBalanceException{
		
		//checking if the account has sufficient balance 
		if(account.getBalance()>=amount){
			//withdrawing the amount from the account
			account.setBalance(account.getBalance()-amount);
		}
		else {
			//throwing an exception if the balance is not sufficient
			throw new InsufficientBalanceException();
		}
		//returning the balance 
		return account.getBalance();
	}

	/**
	* This method does the job in the thread
	*/
	public void run() {
		try{
			//checking if the customer is authorized to withdraw
			//from the given account 
			authorization(account, customer);
			//withdrawing the amount after authorization
			double balance=withdraw(account, amount);
			//displaying the success message
			System.out.println(transactionId+" transaction"+ 
								"completed!!! and the balance amount is "+balance);
		}catch(UnAuthorizedWithdrawTransactionException unAuthorizedWithdrawTransactionException){
			//displaying an appropriate message if the customer is
			//not authorized to do the transaction
			System.out.println(transactionId+" transaction "+ "failed!!! and "+
								unAuthorizedWithdrawTransactionException.getMessage());
		}catch(InsufficientBalanceException insufficientBalanceException){
			//display the error message for insufficient balance
			System.out.println(transactionId+" transaction "+
								"failed!!! and your account has insufficient"+
								"balance");
		}
	}
}
