package day36;

public class WrapperExamples {

	public static void main(String[] args) {
	// new keyword to create Wrapper classes;	
		Boolean b = new Boolean(true);
		Boolean b1 = new Boolean("False");
		
		Character c = new Character ('c');
		Byte bt1 = new Byte((byte)123);
		Byte bt2 = new Byte("123");
		
		Short s1 = new Short((short)1200);
		Short s2 = new Short("1200");
		
		Integer i1 = new Integer(1202);
		Integer i2 = new Integer("1202");
		Integer i3 =  Integer.valueOf(123);
		//Integer i4 =  Integer.valueOf("123");
		
	
		
		Long l1 = new Long(200000); 
		Long l2 = new Long("200000"); 
		
		Float f1 = new Float(12.2f); 
		Float f2 = new Float("12.2");
		
		Double d1 = new Double(3.1432345563); 
		Double d2 = new Double("3.1432345563");
		
	// valueOf method to create wrapper classes;
		
		Boolean b2 = Boolean.valueOf(true);
		Boolean b3 = Boolean.valueOf(false);
		
		Character c1 = Character.valueOf('s');
		
		Byte bt3 = Byte.valueOf((byte) 123 );
		//Byte bt4 = Byte.valueOf("321");
		
		Short s3 = Short.valueOf((short)1200);
		Short s4 = Short.valueOf("1200");
		
		Integer i5 = Integer.valueOf(1202);
		Integer i4 = Integer.valueOf("1200");
		
		Long l3 = Long.valueOf(200000);
		Long l4 = Long.valueOf("2000000");
		
		Float f3 = Float.valueOf(12.8f);
		Float f4 = Float.valueOf("12.2");
		
		Double d3 = Double.valueOf(3.143455);
		Double d4 = Double.valueOf("3.143455");
		
		
		
		//use equals method to find equality of an input
		System.out.println(i4.equals(1200));
		//if you want to store them, do the following;
		String s = c.toString();
		
		//Get string out of Character objects
		System.out.println(c.toString());
		
		
	}

}
