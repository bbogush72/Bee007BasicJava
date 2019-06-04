package day31;

import java.util.Scanner;

public class MoreParameters {

	public static void main(String[] args) {
		// create a static method called login
		/*
		 * it return nothing It takes 3 parameters : user as String , password as
		 * String, rememberMe as boolean inside body You entered username : ---- You
		 * entered password : ---- print you checked remeberMe checkbox if it's true
		 * print you did not check remeberMe checkbox if it's false
		 * 
		 */

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a login id and password and type true to save credentials");
		String login = in.next();
		String password = in.next();
		boolean isChecked = in.nextBoolean();

		login(login, password, isChecked);
		System.out.println();
		
		login("mylogin", "mypassword", isChecked);

	}

	public static void login(String username, String password, boolean rememberMe) {

		System.out.println("You entered username " + username);
		System.out.println("You entered password " + username);
		
		if(rememberMe==true) {
			System.out.println("you checked remeberMe checkbox");
		}else {
			System.out.println("you did not check remeberMe checkbox");
		}
	}

}