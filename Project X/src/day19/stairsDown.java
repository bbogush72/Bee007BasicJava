package day19;

public class stairsDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String star = "*****";

		int x = 5;
		//System.out.println(star);
		while (x >0) {

			star = star.substring(0,x);
			

			System.out.println(star);x--;
		}

	}

}

