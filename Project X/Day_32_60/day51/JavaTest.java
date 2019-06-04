package day51;

public class JavaTest extends Test {
	//since we extend from test class, we get all the instance variables
	/* these data are invisible but noted here for verification
	 int questionCount;
	 int score;
	 String type;
	 */
	
	//level here is like expertise
	int level;
	
public static void main(String[] args) {
	//static way to access .timeLimit, universal for all
	System.out.println(Test.timeLimit);
		
	//accessing inherited static field in a static method
	System.out.println(timeLimit);
		
	//accessing inherited static field in a static way using class name
	System.out.println( JavaTest.timeLimit  );
		
	}
	
}
