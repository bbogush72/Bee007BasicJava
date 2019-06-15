package String2;

public class doubleCharSubstring {

	public String doubleChar(String str)
	{
		String s= "";
		for(int i=0; i<str.length(); i++)
		{
			s= s+ str.substring(i, i+1)+ str.substring(i,i+1);
		}
		return s;
		
	}
	
	public static void main(String[] args) {
		doubleCharSubstring d = new doubleCharSubstring();
		System.out.println(d.doubleChar("snail"));
	}
}
