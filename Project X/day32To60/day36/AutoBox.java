package day36;

public class AutoBox {

	public static void main(String[] args) {
		
		// auto unboxing
		int i1 = new Integer("12"); 
		
		// auto boxing
		Integer i2 = 12; 			
		
		//Integer i1 is auto unboxed to int 12
		int i3 = i1;
		int i4 = new Integer("11");
		//==============================================
		
		//double 3.14 is auto boxed d1
		Double d1 =3.14;
		
		//Double 12.5 is auto unboxed to double
		double d2 = new Double(3.143455);
		
		//d1 with reference type Double auto-unboxed to double
		double d3 = d1;
		
	}

}
