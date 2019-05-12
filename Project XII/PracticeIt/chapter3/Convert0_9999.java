package chapter3;

import java.util.Scanner;


public class Convert0_9999 {
	
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number between 0 - 9999");
		
			convert0_9999(scan.nextInt());	
			
	}
	
	
	public static void convert0_9999(int n) {

		String mystr = "" + n;
		String HundredSection = "hundred";
		String result = "";
		String ThousandSection="thousand";

		if(mystr.length()<5) {
			if(mystr.length()==4) {
				if(Integer.parseInt(""+mystr.charAt(0)) > 0)
				result += digitsectioncheck(Integer.parseInt(""+mystr.charAt(0)))+" "+ThousandSection+" ";
				if(Integer.parseInt(""+mystr.charAt(1)) > 0)
					result += digitsectioncheck(Integer.parseInt(""+mystr.charAt(1)))+" "+HundredSection+" ";
				if(Integer.parseInt(""+mystr.charAt(2)) > 1)
					result += TensSectionCheck(Integer.parseInt(""+mystr.charAt(2)))+" " + digitsectioncheck(Integer.parseInt(""+mystr.charAt(3)));
				else {
					if(Integer.parseInt(""+mystr.charAt(2)) == 1)  result += ElevenToNineteen(Integer.parseInt(""+mystr.charAt(3)));
					else  result += digitsectioncheck( Integer.parseInt(""+mystr.charAt(3) ));   }
			}
			
			if (mystr.length() == 3) {
				if (Integer.parseInt(""+mystr.charAt(0)) > 0)
					result += digitsectioncheck(Integer.parseInt(""+mystr.charAt(0)))+" "+ HundredSection+" ";
				if (Integer.parseInt("" + mystr.charAt(1)) > 1)
					result += TensSectionCheck(Integer.parseInt(""+mystr.charAt(1)))+" "+digitsectioncheck(Integer.parseInt(""+mystr.charAt(2)));
				else {
					if (Integer.parseInt(""+mystr.charAt(1)) == 1)
						result += ElevenToNineteen(Integer.parseInt(""+mystr.charAt(2)));
					else
						result += digitsectioncheck(Integer.parseInt(""+mystr.charAt(2)));
				}
			}
			else if (mystr.length() == 2) {
				if (Integer.parseInt("" + mystr.charAt(0)) > 1) {
					result += TensSectionCheck(Integer.parseInt(""+mystr.charAt(0))) + " ";
					if (Integer.parseInt(""+mystr.charAt(1)) != 0)
						result += digitsectioncheck(Integer.parseInt(""+mystr.charAt(1)));
				} else {
					if (Integer.parseInt(""+mystr.charAt(0)) == 1)
						result += ElevenToNineteen(Integer.parseInt(""+mystr.charAt(1)));
				}
			}
			else if (mystr.length() == 1) {
				if (Integer.parseInt(""+mystr.charAt(0)) == 0)    
						result += "zero";
				else
					result += digitsectioncheck(Integer.parseInt(""+mystr.charAt(0)));
				}
			
		} else result="Too large";
		
		System.out.println(result);
	}
	
	public static String digitsectioncheck(int n) {
		String t = (n==0)?"":(n==1)?"one":(n==2)?"two":(n==3)?"three":(n==4)?"four":(n==5)?"five"
					:(n==6)?"six":(n==7)?"seven":(n==8)?"eight":(n==9)?"nine":"Invalid";
		return t;
		
	}

	public static String TensSectionCheck(int n) {
		String z= (n==1)?"ten":(n==2)?"twenty":(n==3)?"thirty":(n==4)?"fourty":(n==5)?"fifty"
					:(n==6)?"sixty":(n==7)?"seventy":(n==8)?"eighty":(n==9)?"ninety":"Invalid";
		return z;
		}

	public static String ElevenToNineteen(int n) {	
	  String q = (n==0)?"ten":(n==1)?"eleven":(n==2)?"twelve":(n==3)?"thirteen":(n==4)?"fourteen"
						:(n==5)?"fiften" :(n==6)?"sixteen":(n==7)?"seventeen":(n==8)
							?"eighten":(n==9)?"nineteen":"Invalid";
			return q;	
		}

}
