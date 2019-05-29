package day52;

public class InitializerPractice {
	
	int a;
	String b;
	boolean c;
	double d;
	
	{
		a= 5;
		b= "hi";
		c= 10<11;
		d=10.4;
	}
	
	public static void main(String[] args) {
		InitializerPractice obj= new InitializerPractice();
		
		//access integer a value
		System.out.println(obj.a);
		
		//access String type value
		System.out.println(obj.b);
	}
}
