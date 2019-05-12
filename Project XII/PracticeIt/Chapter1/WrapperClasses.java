package Chapter1;

public class WrapperClasses {

	public static void main(String[] args) {
		//create wrapper class objects
		
						//Boolean is the wrapper class
		Boolean b = new Boolean (true);
		Boolean a = new Boolean( false);
		
		// Character is the wrapper class
		Character c = new Character ('c'); 
		
		//for byte data type, Byte is the wrapper class
		Byte bt1 = new Byte((byte)123);
		Byte bt2 = new Byte("123");
				
		//for short type, Short is the wrapper class
		Short s1 = new Short((short)1200);
		Short s2 = new Short("1200");
		
		//for int type, Integer is the wrapper class
		Integer i1 = new Integer(1202);
		Integer i2 = new Integer("1202");
		
		//for long type, Long is the wrapper class
		Long l1 = new Long(200000);
		Long l2 = new Long("200000");
			
		//for float type, Float is the wrapper class
		Float f1 = new Float(12.2f);
		Float f2 = new Float("12.2");
		
		//for double type, Double is the wrapper class
		Double d1 = new Double(3.1432345563);
		Double d2 = new Double("3.1432345563");
		
		//AUTO-BOXING AND AUTO-UNBOXING
		Integer i11 = new Integer(12);
		Integer i12 = 12;// int 12 is autoboxed to Integer i2;
		int i13=i11;// Integer i11 is auto unboxed to int 12
		
		Double d11 = 3.14; // double 3.14 is autoboxed d11
		Double d12 = new Double(12.5);// Double 12.5 is auto-unboxed to double
		double d13 = d11; //d11 with reference type Double auto-unboxed to double.
		
		//Converting  String to primitive X.parseX(str) 
		// Converting String to wrapper class X.valueOf(str)
		
		
		
		
		
	}

}
