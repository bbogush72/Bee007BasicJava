package day43;

import java.util.Arrays;

public class amazonRunner {

	public static void main(String[] args) {

		amazon  a1 = new amazon();
		a1.setCeo("Murat Su");
		System.out.println(a1.getCeo());
		
		amazon a2 = new amazon();
		
		String take = "Jeff Bezos earned 5000 in 3.5 weeks";
		String []takeArray = take.split(" ");
		System.out.println(Arrays.toString(takeArray));
		
		a1.setCeo(takeArray[0]+" "+takeArray[1]);
		a1.setGvalue(Long.parseLong(takeArray[3]));
		
		System.out.println(a1.getGvalue());
	}

}
