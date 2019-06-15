package String2;

/**
 * Given two strings, return true if either of the strings appears at the very
 * end of the other string, ignoring upper/lower case differences (in other
 * words, the computation should not be "case sensitive"). Note:
 * str.toLowerCase() returns the lowercase version of a string.
 * 
 * 
 * endOther("Hiabc", "abc") → true 
 * endOther("AbC", "HiaBc") → true
 * endOther("abc", "abXabc") → true
 */
public class startWith {

	public static void main(String[] args) {
		startWith object = new startWith();
		System.out.println(object.endOther("AbC", "HiaBc"));
	}

	public boolean endOther(String a, String b) {
		/**get the lengths of a and b to compare */
	 	int aSize = a.length();
		int bSize = b.length();
		
		/**create two strings and name them end and temp */
		String end;
		String temp;
		/**change all strings to lowercase */
		a = a.toLowerCase();
		b = b.toLowerCase();
		
		if(aSize >= bSize)
		{
			end = a.substring(aSize - bSize);
			temp = b;
		}
		else
		{
			end = b.substring(bSize - aSize);
			temp = a;
		}
		return (end.equals(temp));
	}

}
