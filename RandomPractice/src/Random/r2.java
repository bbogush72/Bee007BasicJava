package Random;

public class r2 {

	public static void main(String[] args) {
		/**
		 * Widening Casting(Implicit) Byte ---->
		 * short---->int---->long---->float---->double int x = 10; byte y = (byte)x;
		 * Narrowing Casting(Explicitly done)
		 * Double---->float---->long---->int---->short---->byte
		 */
		
		int a =5;
		double b = (int)a;//widening- upcasting
		
		short c = (short)a; //downcasting, narrowing
		
		long d = (long)c; //upcasting
		
		double door =(long) d; //upcasting - widening
		
		byte b1 = (byte)door; //downcasting
		
		System.out.println("double b= "+ b+ "\nshort c= "+c
				           + "\nlong d= "+d+ "\ndouble  door= "+door+
				           "\nbyte b1= "+b1);
		
		float f = 10f;
		long l = (long)f; //downcasting
	}

}
