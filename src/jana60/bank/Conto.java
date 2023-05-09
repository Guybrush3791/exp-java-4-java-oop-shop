package jana60.bank;

import java.util.Random;

public class Conto {

	private String accountNumber;
	private String prorietaryName;
	private int balance;
	
	public Conto(String proprietaryName) {
		
		Random rnd = new Random();
		
		accountNumber = "" + rnd.nextInt(1, 1001); 
		setProrietaryName(proprietaryName);
		balance = 0;
	}

	public String getProrietaryName() {
		return prorietaryName;
	}

	public void setProrietaryName(String prorietaryName) {
		this.prorietaryName = prorietaryName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public int getBalance() {
		return balance;
	}
	public String getFormBalance() {
		
		return String.format("%.2E", getBalance());
	}
	
	public void putMoney(int amount) {

		if (amount < 0) return;
		
		balance += amount;
	}
	public boolean getMoney(int amount) {
		
		if (amount < 0) return false;
		
		if (amount <= balance) {
			
			balance -= amount;
			return true;
		}
		
		
		return false;
	}
	
	@Override
	public String toString() {
		
		return "[" + getAccountNumber() + "] - " 
				+ getProrietaryName() 
				+ "\nbalance: " + getFormBalance();
	}
}
