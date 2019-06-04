package codingBat;

public class doubleChar {

	public String doubleChar(String str)
	{
		String s = "";
		for(int i=0; i<str.length(); i++)
		{
			s= s+ str.charAt(i)+ str.charAt(i);
		}
		
		return s;
	}
	
	
	public static void main(String[] args) 
	{
		doubleChar d = new doubleChar();
		System.out.println(d.doubleChar("Snail"));
	}
}
