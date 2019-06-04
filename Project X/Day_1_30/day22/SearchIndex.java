package day22;

public class SearchIndex {

	public static void main(String[] args) {
		
		
		String str = "ABCAADKAB";
		
		String newStr ="";
		
	
		
		for(int i=0; i<=str.length()-1; i++ ) {
			
		//	System.out.print(str.charAt(i) + "-");
			newStr= str.substring(i,i+1)+ "-";
			
				System.out.print(newStr);
		}
	}

}
/*
for(int i=0;i<str.length();i++) {
	
	str1+=str.substring(i,i+1)+"-";
	
	
}
str1=str1.substring(0,str1.length()-1);
System.out.println(str1);*/