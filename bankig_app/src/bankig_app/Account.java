package bankig_app;

public class Account {

	public int balance;
	public String previousTransaction;
	
	
	public Account() {
		balance = 0;
		previousTransaction = "";
	}
	
	public int checkBalance() {
		
		return balance;
	}
	
	
	public void makeDeposit (int amount) {
		
		balance = balance + amount;
		previousTransaction = "deposit";
	}
	
	
	public void makeWithdrawal (int amount) {
		
		balance = balance - amount;
		previousTransaction = "withdrawal";
	}
	
	
	public String viewPreviousTransaction() {
		
		if (previousTransaction.equals("")) {
			return "No previous transaction";
		} else {
			return previousTransaction;
		}
		
	}
	
}
