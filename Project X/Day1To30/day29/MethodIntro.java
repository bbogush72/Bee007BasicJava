package day29;

public class MethodIntro {

	public static void main(String[] args) {
		//release the horse
		// method that does not take external data
		//method that does not return any value
		//method that does not need an object to be called.
			/*
			 * method is made inside a class. never add a method inside another one
			 * =====================================================================
			 * method is action always named like doSomething, lowercase, camel case for multiple words
			 * 
			 * Arrays.toString(arr);
			 * MethodIntro.releaseTheHorse
			 * 
			 * public == access modifier to define where it can be used
			 * static == non-access modifier ; if defined no object needed to call this
			 * 	
			 * void == method take only action and does not return any value
			 * 
			 * 
			 * public static void messageName (){  }
			 */
		
		MethodIntro.releaseTheHorse(); //prints message for the first time
		
		MethodIntro.releaseTheHorse(); // prints message the second time
		MethodIntro.releaseTheHorse(); // prints message the third time
		
		releaseTheHorse(); //if in same class where method is defined, className. is optional
	}
	
	public static void releaseTheHorse() {
		System.out.println();
		System.out.println("Now now now go go go ain't a break time that is!");
		System.out.println();
		System.out.println("boom boom boom shake the room");
		System.out.println();
		System.out.println("say whaa!");
	}

}

		
