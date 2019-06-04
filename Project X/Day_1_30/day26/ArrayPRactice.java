package day26;

public class ArrayPRactice {

	public static void main(String[] args) {
		
		// 3 ways to create an array; the following first way;
		// String str [] = new String [5] with size; without size codes don't work
		
		//str[0] ="abc";  ===> str[1] ="ef"; ===> str[2] ="eh";
		//to print these; System.out.println(Arrays.toString(str) );
		
		//second way to make arrays
		// String [] names2= new String [] {"aa", null, "bb", "ccc" };
		
		//last way to make arrays
		//String [] names2= {"aa", null, "bb", "ccc" };
		
		String [] names2= {"aa", "", "bb", "ccc" };
		int x= 0;
		while(x<names2.length) {
			System.out.println(names2[x]);
			x++;
		}

	}

}
