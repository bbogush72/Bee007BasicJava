package day46;

public class SlackRunner {

	public static void main(String[] args) {
		//create a class SlackUser
		// private fields name, email, groupNum
		// encapsulate; create getters and setters
		// create 3args constructor to set all field value
		// create a no arg constructor
		// create a toString() method accept no ano arg return
		// return info about slack user object
		// create a method called sendMessage
		// accept two parameters; channel as string, content as string
		// it just prints out User <your name> 
		// sent message <content> to channel <channel>
		//optionally , 
		//create a ArrayList of SlackUser add all the objetcs 
		//loop through each item and print out 
		//and call sendMessage on each of them 
		
		SlackUser s1 = new SlackUser("Ozlem", "ozlem@bulut.com", 19);
		SlackUser s2 = new SlackUser("Ben" , "ben@bogush.com", 19);
		
		System.out.println(s1.getName());
		System.out.println(s1.toString());
		s1.sendMessage("Ozlem", "see you soon");
	}

}
