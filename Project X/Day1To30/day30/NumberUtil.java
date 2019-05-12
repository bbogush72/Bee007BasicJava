package day30;

public class NumberUtil {

	public static void main(String[] args) {
		// Task 2
		

				printTheDoubledNumber(25);
				checkForAge(55);
				

			}
			//public is access modifier
			public static void printTheDoubledNumber(int i)  {
				
				System.out.println(i+=i);
			}
			public static void checkForAge(int i)  {
				
				if(i>18) {
					System.out.println("GrownUp");
				}else
				
				System.out.println("Being a kid afar");
			}
		
	}

