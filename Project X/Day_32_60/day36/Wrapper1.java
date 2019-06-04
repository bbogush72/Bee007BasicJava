package day36;

public class Wrapper1 {

	public static void main(String[] args) {

		Integer a = new Integer(123);
		Integer a0 = new Integer(123);
		
		Integer a2 = Integer.valueOf(123);
		Integer a3 = Integer.valueOf("123");
		
		System.out.println(a + " " + a0 + " " + a2 + " " + a3);
		
		Character c1 = new Character ('c');
		System.out.println(c1);
		
	}

}
