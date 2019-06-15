package day58;

import java.util.ArrayList;

public interface WebDriver {
	/*
	 * Create an interface called WebDriver add a constant called PURPOSE and assign
	 * "Automating Browser" add few abstract methods :
	 * 
	 * openBrowser accept no param and return nothing navigateTo accept a String as
	 * Url and return nothing quit accept no param and return nothing
	 * 
	 * findElementByID accept one int as id and return String findElementsByTagName
	 * accept one String as tagName and return ArrayList of Strings
	 * 
	 * Create implemeting classes called ChromeDriver and FirefoxDriver
	 * 
	 * ChromeDriver class
	 * 
	 * instance fields : int screenSize double positionX
	 * 
	 * add constructor to set the values
	 * 
	 * implemet all abstract methods
	 * 
	 * 
	 * Create ChromeDriver Object and do some action by calling the methods
	 */

	String PURPOSE = "Automating Browser";

	public abstract void openBrowser();

	public abstract void navigateTo(String Url);

	public abstract void quit();

	String findElementByID(int id);

	ArrayList<String> findElementByTagName(String tagName);
		
	//public abstract void clickButton(String name);
	
	//DEFAULT METHOD
	public default void clickButton(String name) {
	System.out.println("Do your implementation without breaking others code");
		
	}
	public default void clickButtonEnterText() {
//		clickButton("MY BLUE");
//		System.out.println("Entering google.com");
	}
	public static void showPurpose() {
		System.out.println("purpose is "+ PURPOSE);
	}
}


