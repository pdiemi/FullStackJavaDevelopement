package bankingexample;

public class WithdrawThread extends Thread {
	private Account account;
	private String name;
	private int amount;
	/**
	 * @param account
	 * @param name
	 * @param amount
	 */
	public WithdrawThread(Account account, String name, int amount) {
		this.account = account;
		this.name = name;
		this.amount = amount;
	}
	
	 
	@Override
	public void run() {
		 account.withdraw(name, amount);
	}
}

