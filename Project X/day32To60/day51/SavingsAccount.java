package day51;

public class SavingsAccount extends BankAccount{

	double returnRate;
	
	/*
	String accountName;
	long accountNumber;
	double balance;
	 */

	public SavingsAccount(String accountName, long accountNumber, 
			double balance, double returnRate)
	{
		super(accountName, accountNumber, balance);
		this.returnRate = returnRate;
		
	}
	@Override
	public void deposit(int money)
	{	//
		super.deposit(10);// shortest way
		//or
	//	this.balance+= money;
		//or
	//	this.balance+=100;
	}

	public void withdraw(int money)
	{
		this.balance= this.balance -money;
	}
	@Override
	public String toString() {
		return "SavingsAccount [returnRate=" + returnRate 
				+ ", accountName=" + accountName + ", accountNumber="
				+ accountNumber + ", balance=" + balance + "]";
	}
	
	
}
