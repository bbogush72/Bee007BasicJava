package day36;

public class ParseInt {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="100";
		int i=Integer.parseInt(s);
		
		//output is 100100 because + is string concatenation operator
		System.out.println(s+100);
		
		//output is 200 because + is binary plus operator
		System.out.println(i+100);

	}
}
