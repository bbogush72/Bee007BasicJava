package ArrayMethods;

public class MajorityCheck {

	public static void main(String[] args) 
	{
		int myArray[] = { 2, 2, 2, 4, 5, 6, 7, 2, 2, 2 };
		int sizeArray = myArray.length;
		int checkMyNum =2;
		if (isMajority(myArray, sizeArray, checkMyNum) == true) 
		{
			System.out.println("the number "+checkMyNum + " appears more than " + sizeArray/2 + " times in my Array");
		}
		else 
		{
			System.out.println("the number "+ checkMyNum + " doesn't appear more than " + sizeArray/2 + "times in my Array");
		}

	}

	public static boolean isMajority(int myArray[], int num, int checkNum) 
	{
		int lastIndex = 0;
		// use ternary to check whether num is less or more than half
		lastIndex = num % 2 == 0 ? num / 2 : num / 2 + 1;

		// check the first occurence of checkNum in the array myArray
		for (int i = 0; i < lastIndex; i++) 
		{
			if (myArray[i] == checkNum && myArray[i + num / 2] == checkNum) 
			{
				return true;
			}
		}

		return false;
	}

}
