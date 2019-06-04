package Study;

public class Break_Continue {

	public static void main(String[] args) {

		
System.out.println("===============break keyword use=============================");
//when iteration of i goes to 4, 
//it will get out of iterations
		for(int i=0; i<10; i++)
		{
			if(i==4) break;
			System.out.print(i);
		}
	System.out.println();	
		
System.out.println("================continue keyword use============================");
//when iteration of i goes to 4, 
//it will skip it and move on to the next iteration and continue
		for(int i=0; i<10; i++)
		{
			if(i==4) continue;
			System.out.print(i);
		}
		System.out.println();	
		
System.out.println("===========break and continue keyword use in while loop===============");
		
		int i= 0;
		while (i<10)
		{
			System.out.print(i+" ");
			i++;
			if(i==4)  continue;
			
			if(i==8) break;
		}
	


	}

}
