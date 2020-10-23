
public class BankAccount {
	
	//account number 
	//customerName
	//balance
	//int yearCreatedAccount 
	//int monthCreatedAccount 
	
	private int accountNum;
	private String customerName;
	private double balance;
	private int yearCreated;
	private int monthCreated;
	
	
	//constructor
	
	public BankAccount(String customerName, double balance, 
			int yearCreated, int monthCreated) {
//		this.accountNum = accountNum; 
//		this.customerName = customerName; 
//		this.balance = balance;
//		this.yearCreated = yearCreated;
//		this.monthCreated = monthCreated;	
		setAccountNum();
		setCustomerName(customerName);
		setBalance(balance);
		setYear(yearCreated);
		setMonth(monthCreated);
	}
	
	//getters
	public int getAccountNum() {
		return accountNum;
	}
	public String getCusName() {
		return customerName;
	}
	public double getBalance() {
		return balance;
	}
	public int getYearCreated() {
		return yearCreated;
	}
	public String getMonthCreated() {
		if(monthCreated < 10) {
			return "0" + monthCreated;
		} else {
			return String.valueOf(monthCreated);
		}		
	}
	
	//setters
	public void setAccountNum() {
//		this.accountNum = accountNum;
		accountNum = (int)(Math.random()*(100000 - 10000)+1) + 10000;
//		for(int i = 1000; i < 10000; i++) {
//			accountNum = (int)(Math.random()*(100000 - 10000)+1) + 10000;
//		}
	}
	public void setCustomerName(String customerName) {
		if(customerName != "" || customerName != null) {
			this.customerName = customerName; 			
		}
	}
	public void setBalance(double balance) {
		if(balance > 0) {
			this.balance = balance;
		}
	}
	public void setYear(int yearCreated) {
		if(yearCreated < 1900) {
			this.yearCreated = 1900;
		} else {
			this.yearCreated = yearCreated;
		}
	}
	public void setMonth(int monthCreated) {
		if(monthCreated <= 12 && monthCreated >= 1) {
			this.monthCreated = monthCreated;
		} else {
			this.monthCreated = 1;
		}
	}
	
	
	
	//deposit(double moneyAccount) 
	//--> Money which customer wants to deposit should be more than 0.
	//check args
	//add money to balance. 
	
	public void deposit(double depositAmount) {
		if(depositAmount > 0) {
			System.out.println("\n$" + depositAmount + " deposit to the account: " + accountNum + "\n");
			balance += depositAmount;
		} else {
			System.err.println("Deposit Amount should be more than Zero.");
		}
	}
	
	
	//withdraw(double moneyAccount) 
	//--> Money which customer wants to withdraw should be less than  balance.
	//check args and balance 
	//minus money from balance. 
	public void withdraw(double withdrawAmount) {
		if(withdrawAmount <= balance && withdrawAmount > 0) {
			System.out.println("\n$" + withdrawAmount + " withdraw from account: " + accountNum + "\n");
			balance -= withdrawAmount;
		} else if(withdrawAmount < 0) {
			System.err.println("Withdraw Amount should be more than Zero.");
		} else if(withdrawAmount > balance) {
			System.err.println("Withdraw Amount should be less than your balance.");
		}
	}
	
	//main --> 2 account, print, test deposit & withdraw, print again. 

}
