package day22;

public class StringCount1 {

	public static void main(String[] args) {
		String str = "ABCDEBC";

		int count = 0;
		String target = "BC";
		for (int i = 0; i < str.length()-target.length()+1; i++) {
			//count++;
			
			String twoChar = str.substring(i, i+target.length());
			System.out.print(twoChar+ " ");
			
			if(twoChar.equals(target)) {
				count++;
			}
		}
		System.out.println();
		System.out.println("count of BC : "+count);
	}

}
