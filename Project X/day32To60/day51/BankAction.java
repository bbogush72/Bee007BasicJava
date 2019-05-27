package day51;

public class BankAction {
	public static void main(String[] args) {
		
		SavingsAccount s1 = new SavingsAccount("Snail",12345L,10_000,5D);
		System.out.println(s1.balance);
		s1.deposit(10);
		System.out.println("10 dollars added, total: "+s1.balance);
		
		System.out.println("Major upgrade in the house, the new balance is 100$");
		s1.balance=100;
		
		s1.withdraw(10);
		System.out.println("10 dollars withdrawn, total: "+s1.balance);

	}
}
