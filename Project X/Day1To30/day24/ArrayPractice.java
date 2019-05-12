package day24;

public class ArrayPractice {

	public static void main(String[] args) {


		String names [] = {"Ali", "Veli", "Nemi", "Lemi", "Demi"};
		
		System.out.println(names[2]);
		
		System.out.println( names[names.length -1]); // last
		
		names[2] = "Semi"; // location of "Nemi" changed to "Semi"
		
		System.out.println(names [2]);
		
		
	}

}
