package Strings;

public class StringMethods {

	public static void main(String[] args) {

		//create two strings and use concat method to add them up
		String str = "Welcome";
		String str1 = " To Java";
		String concat = str.concat(str1);
		System.out.println("Concatenated message: "+concat);
		
		//create a string str2 and add two spaces, at index 0 and last index
		//then remove the spaces in 0 and last location. only right and left spaces can be removed
		String str2 = " Welcome ";
		str2= str2.trim();
		System.out.println(str2);
		
		//create a string str3 and find the item at index 4
		String str3 = " Welcome to Java";
		System.out.println("at index 4: "+str3.charAt(4));
		
		
		/**for the methods below, I utilized str4. Sorry if it's too confusing */
		
		//create a string str4 and use toLower or toUpperCase and contains to 
		//check presence of "wel" in the given message
		String str4 = " Welcome to Java ";
		System.out.println("is there -wel- in the string: " +str4.toLowerCase().contains("va"));
		
		//use indexOf to find the index of "va"
		System.out.println("index of va at: "+str4.indexOf("va"));
		
		//use equals() to check str4 if it has Welcome
		System.out.println("is there Welcome in the string: "+str.equals("Welcome"));
		
		//use equalIgnoreCase method to check if string has welcome word
		System.out.println("Is there JAVA word ignore capitalized word "+str4.equalsIgnoreCase("JAVA"));
		
		//use replace method to replace places and make it "welcome to selenium"
		str4=str4.replace("Java", "Seleniun");//reassigned str4
		System.out.println("Can I print -welcome to seleniun- "+ str4.replace("Java", "Seleniun") );
		System.out.println("Can I also correct word seleniun "+ str4.replace('n', 'm'));
		
	}

}
