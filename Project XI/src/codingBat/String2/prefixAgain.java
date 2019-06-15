package String2;

public class prefixAgain {

	public static void main(String[] args) {
		

	}
	public boolean prefixAgain(String str, int n) {
		  
		  String newS = "";
		  for(int i=0; i< str.length(); i++ )
		  {
		    newS = str.substring(0, n);
		    if(str.substring(n).contains(newS))
		    return true;
		  }
		  return false;
		}
}
