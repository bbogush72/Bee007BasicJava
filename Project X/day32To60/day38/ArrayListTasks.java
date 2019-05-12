package day38;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTasks {

	public static void main(String[] args) {

		 List<Integer> list1 = new ArrayList<> ();
		 
		 
		 
		 int sum=0;
		 int count=0;
		 for(int i=0; i<101; i++) {
			
			 list1.add(i);
			 sum=sum+i;
		 }
		 System.out.println("Total of all numbers 1 to 100: "+sum);
		
		 
		 List<Integer> list2 = new ArrayList<> ();
		 for(int i=100; i>=1; i--) {
			 	list2.add(i);
				
				
				if(i%3==0 && i%5==0 ) {
					System.out.print(i+ " ");
				}
		
		 }
		 
		 System.out.println();
		 
			
			
			for(Integer each : list2 ) {
				
				if(each%15==0) {
					System.out.print(each+ " ");
					count++;
				}
				
			}
			System.out.println();
			System.out.println("count of numbers divisible to 15: "+count);
			
			//adding list 1 and list 2 together and printing 
			//list1.addAll(list2);
			//System.out.println(list1);
			
			//add each and every item from list 2 and add it to list 1
			for(int i=100; i>0; i--) {
				list2.add(i);
			}
			for(int i=0; i<list2.size(); i++) {
				//Integer eachIn2 = list2.get(i);
				list1.add(list2.get(i));
			}
			System.out.println(list1);
	}

}
