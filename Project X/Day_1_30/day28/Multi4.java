package day28;

public class Multi4 {

	public static void main(String[] args) {
		int [] [] data = {  { 2,14,3}, 
							{ 4, 5 },
							{ 9, 7 }  };
		
		
		for (int i=0; i<data .length; i++) {
			
			/*	
			 if (i==2) { continue; } will skip 2nd iteration
			
			 if (i==1) { break; } will get out of loop when i = 1
			
			if(data[i][j]==4) {   continue;  }							*/
			
			
			
			for(int j=0; j<data[i].length; j++) {
				
				System.out.println("data [" + i + "] [" + j + "] = "+ data [i][j]);
			}
		}


	}

}
