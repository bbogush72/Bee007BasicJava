package day40;

class BankAccount {

	String accountholder;
	double balance;
	String accountHolder;
	
	public void holder(){
		System.out.println("accountholder    "+accountholder);
	}
	
	public void sbalance() {
		System.out.println("balance"    +balance);
	}

	public void deposit(int i) {
	
		
	}

	public void printInfo() {
		// TODO Auto-generated method stub
		
	}

	public void withdraw(int i) {
		// TODO Auto-generated method stub
		
	}

	public void add100Dollars() {
		// TODO Auto-generated method stub
		
	}
}


class Bankactivity {

	public static void main(String[] args) {

		
		BankAccount bank=new BankAccount();
		bank.accountholder="muammer";
		bank.balance=11.122;
		bank.sbalance();
		bank.holder();
		
		
	}

}
