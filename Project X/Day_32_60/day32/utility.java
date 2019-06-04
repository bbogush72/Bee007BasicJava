package day32;

public class utility {

	public static void main(String[] args) {

		String name = " Ozlem ";
		System.out.println(name.charAt(1));
		name.length(); // can show that it is int type
		
//		char c = name.charAt(1);
//		System.out.println(c);
		
		int myNum=giveMe5();
		
		//use className.staticMethod to call 
		System.out.println(utility.giveMe5());// two ways to print
		//or directly class static method(parameter)
		System.out.println(giveMe5());
	}
	
	public static int giveMe5() {
		return 5;
		
	}

}
