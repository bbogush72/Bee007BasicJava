package String2;

public class mixString2 {

	public static void main(String[] args) 
	{
		

	}
	
	public String mixString(String a, String b) 
	{
		String str = "";
		
		//find length of a and b;
		int lengthA= a.length();
		int lengthB= b.length();
		
		//use int type Math.max(int1, int2) to find bigger length
		int longer = Math.max(lengthA, lengthB);
		
		//use for loop and if condition then return word
		for(int i=0; i< longer; i++) 
		{
			//if i smaller than lengthA-1 word = a.substring(i, i+1)
			if(i<= lengthA-1) 
			{
				str= str+ a.substring(i, i+1);
			}
			//if i smaller than lengthB-1 str = b.substring(i,i+1)
			if(i<=lengthB-1)
			{
				str= str+ b.substring(i, i+1);
			}
		}
		
		
		return str;
		
	}
	
}
