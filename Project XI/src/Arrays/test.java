package Arrays;

import java.util.ArrayList;

public class test {
	public static void main(String[ ]  args) {
	    String totalNumber = "200" ;
	    int Total = new Integer ( totalNumber );
	    int Total1 = Integer.valueOf( totalNumber);
	    int Total2 = Integer.parseInt( totalNumber);
	    System.out.println(Total2);
//		Integer a=1;
//
//		ArrayList<Integer> list= new ArrayList<>();
//		
//		list.size();
//		list.contains(o);
//		list.length();
//		list.isEmpty();
//
//		list.add(3);
//
//		list.add(2);
//
//		list.add(1);
//
//		System.out.println( list.remove( a ) );
//		//* Comment */
		
		ArrayList<String> names = new ArrayList<>();

		names.add("John");

		names.add("James");

		names.add("Aaron");
		
	//	names.remove("James");
	//	names.remove( 0 );
		names.remove(1);
		System.out.println(names.toString());
		}
	
	/*
	 * 
	 * 
	 * public static void main(String[ ] args) {

char A = 'U';

Numbers(A);

}

 

public static void Numbers( int num1) {

System.out.println("int number: "+num1);

}

 

public static void Numbers( double num1) {

System.out.println("double number: "+num1);

}

 

public static void Numbers( short  num1) {

System.out.println("short number: "+num1);

}

}
	 */
}