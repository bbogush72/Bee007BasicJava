package codingBat;

public class CountHi {
		
/**accessModifier=public -- Return Type= int -- method name = countHi -- parameter= String str  
 * method name + parameter list = method signature  */	
	
	public int countHi(String str) {
		//to get how many 'hi' words, we need a count variable
		int count =0;
		
		// must iterate through all index numbers in given String
		for (int i = 0; i < str.length()-1; i++) 
		{
			// create an empty string to copy two letters in it
			// two letters we will compare with "hi"
			String s ="";
			
			//copy two letters and iterate over all index numbers
			// at every iteration, s will be assigned to the next two letters
			s = s+ str.substring(i, i+2);
			
			// check if string s equals with "hi"
			if(s.equals("hi"))
			{
				//everytime there is a match, add a count for each iteration
				count++;
			}
		}
		
		return count;
	}
	// add a main method to call the count value
	public static void main(String[] args) 
	{
		CountHi theCount = new CountHi();
		
		System.out.println("There are "+theCount.countHi("hiHihiHihi") + " hi words in given String");
	}
}
