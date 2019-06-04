package day51;
		/*
		 * Task 2 
	Create a BankAccount class 
		fields : 
			accountName as String
			accountNumber as long 
			balance as double 

		Constructor 
			3 args constructor to set all above value 

		methods : 
			toString method
			deposit accept one int as parameter 
				and it changes the balance accordingly
			withdraw accept one int as parameter
				and it changes the balance accordingly

	Create a sub class called SavingAccount 
		field : 
			double returnRate
		Constructor 
			4 args constructor to set all above value 

		overriden methods : 
			toString method
			deposit accept one int as parameter 
				and it changes the balance accordingly
				but you get 100$ for each deposit 
			withdraw accept one int as parameter
				and it changes the balance accordingly
				but you get 10$ penalty for each withdraw 

		 */
	public class BankAccount {
		String accountName;
		long accountNumber;
		double balance=1000;
	
	public BankAccount(String accountName, long accountNumber, double balance) {
		//super();
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	//toString method
	@Override
	public String toString() {
		return "BankAccount [accountName=" + accountName + ", accountNumber=" + accountNumber + ", balance=" + balance
				+ "]";
	}
	
	//deposit accept one int as parameter 
	//and it changes the balance accordingly
	public void deposit (int money) {
		this.balance += money;
	}
	
	//withdraw accept one int as parameter
	//and it changes the balance accordingly
	public void withdraw (int money) {
		this.balance -= money;
	}
	
}

