package day17;

public class Concat {

	public static void main(String[] args) {
		
		String a ="abc"; //in pool
		
		String b = a.concat("efg"); //
		
		System.out.println(b);
		
		String c = "abcefg";
		
		System.out.println( b==c );

	}

}
