package day46;
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

public class SlackUser {
	private String name;
	private String email;
	private int groupNum;

	public SlackUser(String name, String email, int groupNum)
	{
		this.name=name;
		this.email=email;
		this.groupNum=groupNum;
	}
	
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	public int getGroupNum() 
	{
		return groupNum;
	}

	public void setGroupNum(int groupNum) 
	{
		this.groupNum = groupNum;
	}

	@Override
	public String toString() 
	{
		return "SlackUser [name=" + name + ", email=" + email + ", groupNum=" + groupNum + "]";
	}

	public void sendMessage(String channel, String message)
	{
		System.out.println(this.name+ " send message "+message
				+ " to channel "+channel);
	}
}
