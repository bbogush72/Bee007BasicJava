package String2;

public class XyzThere2 {
	//main method
	public static void main(String[] args) {
		//create a new object named z1 as an example
		xyzThere z1 = new xyzThere();
		//use z1.className and print out "abc.xyzxyz"
		//that way it returns true or false
		System.out.println(z1.xyzThere("abc.xyzxyz"));
	}
	//non static method
	public boolean xyzThere(String str) {
		//use loop to check every 3 letters if they match xyz
		//consider exlcuding .xyz
		for(int i=0; i< str.length()-2;i++)
			
		{	//use substring 0-2 which is i, i+3 and equals xyz
			// 0 - 2 has three locations 0, 1 and 2,
			// it is why we use i, i+3 to include 0,1,2 but not 3
			if(str.substring(i, i+3).equals("xyz"))
			{	//if i equals 0, then xyz found in first 3 index
				//return true
				if(i==0)
				{
					return true;
				}
				// if there is '.' use != and charAt to exclude
				// once you exclude it, it will find xyz anywhere
				//returns true
				else if(str.charAt(i-1) != '.')
				{
					return true;
				}
			}
		}
		// if there is no xyz present return false,
		return false;
		
	}

}
