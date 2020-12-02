package bankingexample;

public class DepositThread extends Thread {
	
	private Account account;
	private String name;
	private int amount;
	/**
	 * @param account
	 * @param name
	 * @param amount
	 */
	public DepositThread(Account account, String name, int amount) {
		this.account = account;
		this.name = name;
		this.amount = amount;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		account.deposit(name, amount);
	}
}
