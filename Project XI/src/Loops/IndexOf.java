package Loops;

public class IndexOf {

	public static void main(String[] args) {

		String word= "Amazon";
		word = word.toLowerCase();
		char letter = 'z';
		int index=-1;
		
		//using for loop, look for the letter
		//if it's a match, assign a value to index
		//exit loop
		//print value of index
		
		for(int i=0; i<word.length(); i++)
		{
			if(word.charAt(i)==letter)
			{
				index=i;
				break;
			}
		}
		System.out.println("index of 'z' is "+index);
	}

}
