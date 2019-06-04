package day25;

public class StringArrayMax {

	public static void main(String[] args) {

		String movies[] = new String[4];
		movies[0] = "Life";
		movies[1] = "without";
		movies[2] = "love is";
		movies[3] = "meaningless";
		
		
//get the location of the word that has the max length
		
		int max = movies[0].length();
		int index=0;
		
		for (int i = 0; i <= 3; i++) {
			if (movies[i].length() > max) {
				max = movies[i].length();
				index=i;
				
			}
		}
		
		System.out.print(index+" is of the word location" + 
				" that has the max length: "+ movies[index]);
		
	}

}
