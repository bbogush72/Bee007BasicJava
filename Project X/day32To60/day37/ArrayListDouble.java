package day37;

import java.util.ArrayList;

public class ArrayListDouble {

	public static void main(String[] args) {

		ArrayList<Double> SnailMail = new ArrayList<>();
		// create an arraylist(above) then add 5 double values;
		SnailMail.add(3.1);
		SnailMail.add(4.1);
		SnailMail.add(5.1);
		SnailMail.add(12.1);
		SnailMail.add(11.1);

		// print the 3rd item
		System.out.println();
		System.out.print("index 3 contains: " + SnailMail.get(3));
		System.out.println();

		// find any greater then 10
		for (Double each : SnailMail) {
			if (each > 10) {
				System.out.println();
				System.out.println("any value greater than 10: " + each);
				System.out.println();
			}
		}

		// print all values in the array.
		System.out.println("all values in the array");
		System.out.println();
		for (int i = 0; i < SnailMail.size(); i++) {
			System.out.print(SnailMail.get(i) + " - ");
		}
		
		//get the sum of all the numbers
		System.out.println();
		double sum=0;
		for(double each: SnailMail) {
			sum+=each;
		}
		//fix below
		System.out.println("total value: "+sum);
		int total=0;
		for(int i=0; i<SnailMail.size(); i++) {
			
			total=total+i;
			
		}
		System.out.println("total using clasic for loop: "+ total);
	}

}
