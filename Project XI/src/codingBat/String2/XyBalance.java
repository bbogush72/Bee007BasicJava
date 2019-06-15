package String2;

public class XyBalance {

	public static void main(String[] args) {
	

	}

	public boolean xyBalance(String str) {
		  // Find the rightmost y
		  int y = -1;
		  for (int i = 0; i < str.length(); i++) {
		    if (str.charAt(i)=='y') y = i;
		  }
		  
		  // Look at the x's, return false if one is after y
		  for (int i = 0; i < str.length(); i++) {
		    if (str.charAt(i)=='x' && i > y) 
		    	return false;
		  }
		  return true;

		  // Solution notes: this solution uses two loops, each written the simple
		  // 0..length way. You could do it with a single reverse loop, noticing
		  // if you see an x before a y. Or use lastIndexOf().
		}
}
