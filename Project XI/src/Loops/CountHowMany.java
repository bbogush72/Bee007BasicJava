package Loops;

public class CountHowMany {

	public static void main(String[] args) {

		/* "I think it's fair to say practice can be heplful in learning
		Just about anything it can be true." */
		
		//Add a char to count to find how many occurences of letter 'a' in the given String
		String sentence = "I think it's fair to say practice can be heplful in learning. "
				+ "Just about anything it can be true.";
		char myChar = 'a';
		int counter = 0;
		
		for(int i=0; i<sentence.length(); i++)
		{	//if you find the char value, count it in the if block
			if(sentence.charAt(i)==myChar)
			{
				counter++;
			}
		}
		System.out.println("Total number of occurences of 'a' is "+counter);
	}

}
