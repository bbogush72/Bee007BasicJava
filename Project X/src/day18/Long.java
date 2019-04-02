package day18;
import java.util.Scanner;
public class Long {

	public static void main(String[] args) {
		
		long x = 10;
		long y = 15;
		
		System.out.println(x==y);
		
		//scan1 is a variable/container hold address of any single scanner object
		//the reference to an object// pointer to any object
		
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		Scanner scan3 = scan2;
		
		System.out.println(scan1==scan2);
		
		String s1 ="Literal"; //pool
		
		String s2 = new String("Literal");
		
		System.out.println(s1.equals(s2));
		System.out.println(scan2==scan3);
		
		
		
	}

}
