package Strings;

import javax.swing.JOptionPane;

public class ComputeChange {

	public static void main(String[] args) {

		//Receive the amount from keyboard
		String amountString = JOptionPane.showInputDialog(null, 
				"Enter an amount in double, for example 11.56");
		
		//CONVERT STRING TO DOUBLE
		double amount = Double.parseDouble(amountString);
		int remaining = (int) amount*100;
		
		//FIND THE NUMBER OF 1 DOLLARS
		int numberofOneDollars = remaining/100;
		remaining = remaining %100;
		
		//FIND THE NUMBER OF QUARTERS IN THE REMAINING AMOUNT
		int numberofQuarters = remaining/25;
		remaining = remaining%25;
		
		//FIND THE NUMBER OF DIMES IN THE REMAINING AMOUNT
		int numberofDimes = remaining/10;
		remaining= remaining%10;
		
		//FIND NUMBER OF NICKELS IN THE REMAINING AMOUNT
		int numberofNickels = remaining/5;
		remaining = remaining%5;
		
		//FIND THE NUMBER OF PENNIES IN THE REMAINING AMOUNT
		int numberofPennies = remaining;
		
		//DISPLAY RESULTS
		String output= "Your amount "+ amount+ " consist of \n"+
		numberofOneDollars+ " dollars\n"+ 
		numberofQuarters+ " quarters\n"+
		numberofDimes+ " dimes\n"+
		numberofNickels+ " nickles\n"+
		numberofPennies+ " pennies";
		JOptionPane.showMessageDialog(null, output);
		
	}

}
