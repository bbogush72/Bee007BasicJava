package String2;

public class xyzThere {

	public static void main(String[] args) {
		xyzThere s1 = new xyzThere();
		System.out.println(s1.xyzThere("abcxyz"));
		System.out.println(s1.xyzThere("abc.xyzxyz"));

	}
	
	public boolean xyzThere(String str) {
		  
		  if(str.contains("xyz") & !str.contains(".xyz") )
		  return true;
		  else if(str.contains(".xyzxyz"))
		  return true;
		  else
		  return false;
		}
}
