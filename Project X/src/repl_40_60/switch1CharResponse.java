package repl_40_60;

import java.util.Scanner;

public class switch1CharResponse {
  public static void main(String[] args) {
    //DO NOT CHANGE
    char response = 'a';
    //WRITE YOUR CODE HERE 
    Scanner input = new Scanner(System.in);

    System.out.print("Enter command:");
		
		response = input.next().charAt(0);

		switch (response) {
		case 'y':
			System.out.print("\n"+"Your request is being processed is printed");
			break;
		case 'n':
			System.out.print("\n"+"Thank you anyway for your consideration is printed");
			break;
		case 'h':
			System.out.print("\n"+"Sorry, no help is currently available is printed");
			break;
		default:
			System.out.print("\n"+"Invalid entry, please try again");
		}
	}

}
