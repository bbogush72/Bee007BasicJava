package day40;

public class Banking {
	//create 2 instance fields balance, accountHolder
		//then create a non static method showAccountHolder()
		//this method will have void return type
		//and will just print account holder name
		//create a method showBalance(), it will not take any parameters
		//it will print balance
		//optional: create a method that will add 1$ to the balance
		//create a class called BankActivity
		//set account holder name
		//and set balance
		//call showBalance() and showAccountHolder() inside that class

	double balance;
	String accountHolder;

	public String accountHolder() {
		return accountHolder;
		
	}
	public double showBalance() {
		return balance;
		
	}
	public void printInfo() {
		System.out.println("Customer: " + accountHolder + ", Balance: " + balance);
	}
	
}