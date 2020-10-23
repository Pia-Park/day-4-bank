import java.util.Scanner;

public class Driver {

	public static void printAccountInfo(BankAccount tempAccount) {
		System.out.println("Acount Number: " + tempAccount.getAccountNum() + "\n"
				+ "Full Name: " + tempAccount.getCusName() + "\n"
				+ "Balance: $" + tempAccount.getBalance() + "\n"
				+ "Created Year/Month: " + tempAccount.getYearCreated()+ "/" 
				+ tempAccount.getMonthCreated()+"\n");		
	}
	
	
//	public static void makeTransition(BankAccount first, BankAccount second) {
//		Scanner input = new Scanner(System.in);
//		System.out.println("If you are the first user please enter 1 else please enter 2");
//		int numEntered = input.nextInt();
//		System.out.println("For deposit please enter d and for withdraw please enter w");
//		String stringEntered = input.next();
//		System.out.println("Please Enter the amount that you want to make transition");
//		double amountEnterd = input.nextDouble();
//		
//		if(numEntered == 1) {
//			switch (stringEntered) {
//				case "d" :
//					first.deposit(amountEnterd);
//					printAccountInfo(first);
//					break;
//				case "w" :
//					first.withdraw(amountEnterd);
//					printAccountInfo(first);
//					break;
//				default :
//					System.err.println("Wrong Input");
//			}
//		} else if (numEntered == 2) {
//			switch (stringEntered) {
//				case "d" :
//					second.deposit(amountEnterd);
//					printAccountInfo(second);
//					break;
//				case "w" :
//					second.withdraw(amountEnterd);
//					printAccountInfo(second);
//					break;
//				default :
//					System.err.println("Wrong Input");
//			}
//			
//		} else {
//			System.err.println("Wrong Input");
//		}
//	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		BankAccount b1 = new BankAccount("Park Inae", 2400.0, 2004, 30);
		BankAccount b2 = new BankAccount("Kuchi PHA", 20.0, 1987, 12);
		BankAccount b3 = new BankAccount("PaPA mama", 140.22, 2002, 2);
		
		BankAccount[] accounts = new BankAccount[3];
		
		printAccountInfo(b1);
		printAccountInfo(b2);
		
//		makeTransition(b1, b2);
		
		
//		System.out.print("\nEnter the amount that you want to deposit to first account:");
////		double amountEntered = input.nextDouble();
//		b1.deposit(input.nextDouble());
//		printAccountInfo(b1);
//		
//		System.out.print("\nEnter the amount that you want to withdraw from second account: ");
////		double enteredWD = input.nextDouble();
//		b2.withdraw(input.nextDouble());
//		printAccountInfo(b2);
			
	}

}
