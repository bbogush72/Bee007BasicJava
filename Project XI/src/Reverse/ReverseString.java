package Reverse;

public class ReverseString {

	public static void main(String[] args) {
		
		System.out.println(reverse("necessary"));

	}
	
	public static String reverse(String str)
	{
		String reversed = "";
		
		for (int i = str.length(); i>0; i--) 
		{
			reversed = reversed+ str.charAt(i-1);
		}
		return reversed;
		
	}

}
