package day58;

import java.util.ArrayList;
import java.util.List;

public class ChromeDriver implements WebDriver {
	int screenSize;
	double positionX;
	
	
	public ChromeDriver(int screenSize, double positionX) {
		
		this.screenSize = screenSize;
		this.positionX = positionX;
		openBrowser();
	}
	@Override
	public String toString() {
		return "ChromeDriver [screenSize=" + screenSize + ", positionX=" + positionX + "]";
	}
	public ChromeDriver() {
		screenSize =14;
		positionX = 2.5;
		System.out.println("Created a no arg ChromeDriver");
		openBrowser();
	}
	@Override
	public void openBrowser() {
		System.out.println("Open web page");
		
	}

	@Override
	public void navigateTo(String Url) {
		System.out.println("go to " + Url);
		
	}

	@Override
	public void quit() {
		System.out.println("exit the page");
		
	}
	@Override
	public String findElementByID(int id) {
		System.out.println("Look for element with id: "+ id);
		return "myElement" + id;
	}

	@Override
	public ArrayList <String> findElementByTagName(String tagName){
		   ArrayList<String> allElements = new ArrayList<String>(); 
		    allElements.add("first checkbox"); 
		    allElements.add("another textbox");
		    allElements.add("sign up link");
		    
		    return allElements; 
		    
		  }
	public static void main(String[] args) {
		ChromeDriver driver1 = new ChromeDriver();
		driver1.quit();
		
		
		ChromeDriver driver2 = new ChromeDriver(5, 100);
		driver2.navigateTo("google.com");
		driver2.findElementByID(100);
		List<String> allElms = driver2.findElementByTagName("p");//why nothing happened before List
		System.out.println(allElms);
		
		driver2.clickButton("abc"); // not printing why; must do implementation
		
		driver2.clickButtonEnterText();
		
		//only way to access static method in the interface webdriver
		WebDriver.showPurpose();
	}
	@Override
	public void clickButton(String name) {
		
		System.out.println("Clicking "+ name + " button");
	}
	public void clickButtonEnterText() {
		clickButton("MY BLUE");
		System.out.println("Entering google.com");
		quit();
	}

}
