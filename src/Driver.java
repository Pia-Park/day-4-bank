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
	
	public static int findIndexOfAccounts(BankAccount[] accounts, String cName) {
		for(int i = 0; i < accounts.length; i++) {
			if(accounts[i].getCusName().equalsIgnoreCase(cName)) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		BankAccount b1 = new BankAccount("Park Inae", 2400.0, 2004, 30);
		BankAccount b2 = new BankAccount("Kuchi PHA", 20.0, 1987, 12);
		BankAccount b3 = new BankAccount("PaPA mama", 140.22, 2002, 2);
		
		BankAccount[] accounts = new BankAccount[3];
		accounts[0] = b1;
		accounts[1] = b2;
		accounts[2] = b3;
		
		System.out.println("Please enter your name: ");
		String cusName = input.nextLine();
		
		int index = findIndexOfAccounts(accounts, cusName);
		
		if(index == -1) {
			System.err.println("We dont't have" + cusName);
		} else {
			System.out.println("Please enter w for withdraw, d for deposit: ");
			String s = input.nextLine();
			System.out.println("Please enter the amount: ");
			double a = input.nextDouble();
			switch(s.toLowerCase()) {
			case "w":
				//do something 
				accounts[index].withdraw(a);
				printAccountInfo(accounts[index]);
				break;
			case "d":
				//do something 
				accounts[index].deposit(a);
				printAccountInfo(accounts[index]);
				break;
			default :
				System.err.println("Wrong input.");	
			}
		}
		System.out.println(index);
		
//		printAccountInfo(b1);
//		printAccountInfo(b2);
		
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
