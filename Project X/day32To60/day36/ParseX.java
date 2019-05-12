package day36;

public class ParseX {

	public static void main(String[] args) {
		
		//parseX method will take String and return a primitive value
		// Converting String to primitive
		String str = "True";
		boolean b1 = Boolean.parseBoolean(str);
		boolean b2 = Boolean.parseBoolean("ABC");
		boolean b3 = Boolean.parseBoolean("True");
		
		// From String to Wrapper class object,
		// valueOf method will take String and return Wrapper object
		String d = "3.14";
		Double d1 = Double.valueOf(d);
		System.out.println(d1.toString());
		
		double d3 = d1; //Auto unboxing this is;
		
		//invalid conversion
	//	System.out.println(Double.parseDouble("3.14abc"));
	//	System.out.println(Integer.valueOf("3.14"));
		
		
		
	}

}
