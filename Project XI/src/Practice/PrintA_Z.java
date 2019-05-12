package Practice;

public class PrintA_Z {

	public static void main(String[] args) {
		char a = 'a';
		
		char next = 'a' +1; // that is 98 in ascii, which is letter "b"
							// or directly use System.out.println(a+1);
		
		char next1 = (char)(a+1);
		System.out.println(next1); // gives us the letter "b" not the ascii code
		
		int asciiCode ='A';
		System.out.println(asciiCode);
		
		for(int i=asciiCode; i<= 'Z'; i++) {
			
			char eachChar  =(char) i;
			System.out.print(eachChar+ " ");
		}
		
		
		
		

	}

}
