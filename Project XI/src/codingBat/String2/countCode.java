package String2;

public class countCode {

	public static void main(String[] args) {
		

	}
	public int countCode(String str) {
		int times = 0;
		int i = 0;
		int len = str.length()-3;
		while(i <  len)
		{
			if(str.charAt(i) == 'c' && str.charAt(i+1) == 'o' 
					&& str.charAt(i+3) == 'e')
			{
				times++;
				i += 4;
			}
			else
				i++;
		}
		return times;
	}

}
