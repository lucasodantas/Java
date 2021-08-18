package entities;

public class User {

	private String accountName;
	private int accountNumber;
	private double accountValue;
	
	public User(String accountName, int accountnumber, double initialDeposit) {
		this.accountName = accountName;
		this.accountNumber = accountnumber;
		deposit(initialDeposit);
	}
	
	public User(String accountName, int accountNumber) {
		super();
		this.accountName = accountName;
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public int getAccountnumber() {
		return accountNumber;
	}

	public double getAccountValue() {
		return accountValue;
	}

	public void number (int accountNumber) {
		this.accountNumber += accountNumber;
	}
	
	public void deposit (double accountValue) {
		this.accountValue += accountValue;
	}
	
	public void saque (double accountValue) {
		this.accountValue -= (accountValue + 5.00);
	}
	
	public String toString() {
		return "Account "
				+ accountNumber
				+", holder: "
				+ accountName
				+", Balance: $"
				+ String.format("%.2f",accountValue);
	}
}
