package bankig_app;

import java.util.Scanner;

public class Main_app {
	
	public static int amount = 0;
	public static int newOp = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account account = new Account(); 
		
		
		while (newOp == 1) {
			System.out.println("Please select desired operation:\n"+
								"1. Check balance\n" +
								"2. Make a deposit\n" +
								"3. Make a withdrawal\n" +
								"4  View previous transaction\n");
			
			
			Scanner scanner = new Scanner(System.in);
			int operation = scanner.nextInt();
			
			switch(operation) {
			  case 1:
				  System.out.println("Your balance is: " + account.balance);
				  break;
			  case 2:
				  System.out.println("Enter amount to deposit");
				  amount = scanner.nextInt();
				  account.makeDeposit(amount);
				  System.out.println("After deposit, your balance is: " + account.balance);
				  break;
			  case 3:
				  System.out.println("Enter amount to withdraw");
				  amount = scanner.nextInt();
				  account.makeWithdrawal(amount);
				  System.out.println("After withdrawal, you balance is: " + account.balance);
				  break;
			  case 4:
				  System.out.println("The preious transaction was: " + account.viewPreviousTransaction());
				  break;
			}
			
			System.out.println("Do you want to make another operation?\n" +
			                   "1. Yes\n" +
			                   "2. No\n");
			newOp = scanner.nextInt();
		}
	}

}
