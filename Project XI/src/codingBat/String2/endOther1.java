package String2;

public class endOther1 {

	public static void main(String[] args) {
		startWith z = new startWith();
		endOther1 z1 = new endOther1();
		System.out.println(z.endOther("Hiabc", "abc"));
		System.out.println(z.endOther("AbC", "HiaBc"));

	}
	
	public boolean endOther(String a, String b)
	{
		String str = a.toLowerCase(), 
			   str1 = b.toLowerCase();
		
		return(str.endsWith(str1)|| str1.endsWith(str));
	}
	public endOther1(){
		System.out.println("I am a default constructor");
	}

}

/** 	
endOther("AbC", "HiaBc") → true	
endOther("abc", "abXabc") → true	
endOther("Hiabc", "abcd") → false	
endOther("Hiabc", "bc") → true	t
endOther("Hiabcx", "bc") → false
endOther("abc", "abc") → true	
endOther("xyz", "12xyz") → true	
endOther("yz", "12xz") → false		
endOther("Z", "12xz") → true	
endOther("12", "12") → true	
endOther("abcXYZ", "abcDEF") → false
endOther("ab", "ab12") → false	
endOther("ab", "12ab") → true 
endOther("Hiabc", "abc") → true*/