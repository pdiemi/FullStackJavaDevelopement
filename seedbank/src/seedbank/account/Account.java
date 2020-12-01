package seedbank.account;

import seedbank.customer.Customer;

/*
 * Account class represents the account of the customer of the SeedBank
 */
public class Account {
	/*
	* The account No of the account
	*/
	private int accountNo;
	/*
	* The customer Id of the customer to whom the account belongs to.
	*/
	private Customer customer;
	/*
	* The bank balance of the account
	*/
	protected double balance;
	
	/**
	* The parameterized constructor of the Account class
	* @param accountNo the account Number of the account
	* @param custId the customer Id to whom the account belongs
	* @param balance the account balance
	*/
	public Account(int accountNo,Customer customer,double balance){
		this.accountNo=accountNo;
		this.balance=balance;
		this.customer=customer;
	}
	
	/**
	* The default constructor for Account
	*/
	public Account(){}
	
	/**
	* The getter method for the Account number
	* @return the accountNo
	*/
	public int getAccountNo() {
		return accountNo;
	}
	
	/**
	* The setter method for the Account number
	* @param accountNo the accountNo to set
	*/
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	
	/**
	*The getter method for the Account balance
	* @return the balance
	*/
	public double getBalance() {
		return balance;
	}
	/**
	* <h3>Description :</h3> The setter method for the Account
	* balance
	* @param balance the balance to set
	*/
	public void setBalance(double balance) {
	this.balance = balance;
	}
	
	/**
	* The getter method for the Account's customer
	* @return the customer
	*/
	public Customer getCustomer() {
		return customer;
	}
	
	/**
	* The setter method for the Account's customer
	* @param customer the customer to set
	*/
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
