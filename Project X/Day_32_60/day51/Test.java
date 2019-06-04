package day51;

public class Test {

	int questionCount;
	int score;
	String type;
	
	// use static so all tests have the same time
	static int timeLimit=45;

	//static method can only access static members
	public static void printTimeLimit()
	{
		System.out.println("time limit "+ timeLimit);
	}
	
	@Override
	public String toString() 
	{
		return "Test [questionCount=" 
				+ questionCount + ", score=" 
				+ score + ", type=" + type + "]";
	} 
	
	
}
