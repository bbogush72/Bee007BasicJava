package day24;

public class Array5 {

	public static void main(String[] args) {
		//array 5 int
		//double the value of 3rd item
		//update the value of 4th item to sum of first and second items
		
		//print using loop
		
		
		int line []= {1,4,6,4,8,5,9};
		
		line [2]= line[2]*2;
		System.out.println(line[2]);
		
		line[4] = line[0] + line[1];
		System.out.println(line[4]);
		
		int num =0;
		
		for( int i=0; i<=5; i++) {
			
			System.out.print(line[i]);
			
		}
		System.out.println();
		
		// swap the value of first and last items		
					int temp = line[line.length-1];
					
					line[line.length-1] = line[0];
					
					line[0]=temp;
					
					System.out.println("line zero "+ line[0]);
					
					System.out.println("line last "+ line[4]);
	}

}
