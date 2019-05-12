package day33;

public class Return2 {

	public static void main(String[] args) {

		ageTester(16);
		System.out.println();
		ageTester(26);
		System.out.println();
		EligibleToWork(37);
		System.out.println();
		ageTester(26);
		
		System.out.println(EligibleToWork(17));
		
	}
	
	public static void ageTester(int age) {
		if(age<18) {
			System.out.println("Not eligible to work");
			return;}
		
		System.out.println("Cannot work");
		}
	
	public static boolean EligibleToWork(int age) {
			if(age>18) {
				System.out.println("eligible to work");
				System.out.println("go to work");
				System.out.println("pay the bills");
				return true;
				
				
				
			}
			
		return false;
		
	}

}
