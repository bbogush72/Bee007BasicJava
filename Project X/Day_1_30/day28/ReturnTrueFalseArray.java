package day28;

public class ReturnTrueFalseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] num = { 15, 18, 13 ,101, 153, 167};
		
		boolean result = true;
		
		for(int i=0; i<num.length; i++) {
			
			if(num[i]<= 10) {
				result=false;
				break;
			}
		
		}

		System.out.println(result);
	}	

}
