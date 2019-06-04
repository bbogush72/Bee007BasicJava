package day51;

public class AdminUser extends SlackUser{

	int adminLevel;
	//these instance variables come from Slack User
//	 String displayName;
//	 int timeZone;
//	 String status;

	public AdminUser(String displayName, int timeZone, String status, int adminLevel) 
	{
		super(displayName,timeZone,status);
//		this.displayName = displayName;
//		this.status = status;
//		this.timeZone=timeZone;	
		this.adminLevel = adminLevel;
		
	}
	 public void sendMessage(String message) 
	{
		    
		    System.out.println("@channel"+displayName+"> is one good person in the world <" 
		            + message+">" );
		    
     }

	
	
	public String toString() {
		return "AdminUser[Admin Level=" + adminLevel + ", displayName=" + ", timeZone=" + timeZone
				+ ", status= " + status + "]";
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		AdminUser a1 = new AdminUser("B11", 5, "FULLY CHARGED", 1); 
	    a1.sendMessage("abc");
		
	}
	
	
	
}
	
	
