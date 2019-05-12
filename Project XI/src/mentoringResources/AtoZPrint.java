package mentoringResources;

public class AtoZPrint {

	public static void main(String[] args) {
			//char letter = 'a';
			
		int AsciiCode = 'A';
		System.out.println(AsciiCode);
		
		for( int i=AsciiCode; i<= 'Z'; i++ ) {
			char eachChar =(char) i;
			
			System.out.print(eachChar + " ");
			
		}
	}

}
