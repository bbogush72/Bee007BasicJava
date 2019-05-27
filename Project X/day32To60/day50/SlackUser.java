package day50;

/*
 *SlackUser
instance fileds : 
displayName as String
timezone as int
status as String
constructor --
no arg constructor to jsut print out empty slack user  
3 args constructor to set All fields value
instance methods : 
sendMessage    
have one parameter as message and has no return type
print --- <displayName> is sending<Message>
changeStatus
accept one String as parameter and change status to new status
2 sub classes :
StudentUser
groupNumber as int 

Create a 4 args constructor to set all field values of StudentUser

// generate toString method so we can print out object directly 
// create method called displayGroup return nothing 
Optional 
print out message --<displayName> is member of group <groupNumber>


Optional : 
AdminUser
adminLevel as int 

Create a 4 args constructor to set all field values of AdminUser
// generate toString method so we can print out object directly 
 */
public class SlackUser {

	public static void main(String[] args) {

		//StudentUser student1 = new StudentUser("SnailMail", 6, "not available", 2);
		
	
		//(String displayName, int timeZone, String status, int adminLevel)
		AdminUser admin1 = new AdminUser("mysteron", 6, "not there", 2);

		//System.out.println(student1);
		System.out.println(admin1);
	}

	String displayName;
	int timeZone;
	String status;

	public SlackUser() {
		System.out.println("Slackuser No arg constructor");
	}

	public SlackUser(String displayName, int timeZone, String status) {
		super();
		this.displayName = displayName;
		this.timeZone = timeZone;
		this.status = status;
		System.out.println("Slackuser 3 arg constructor");
	}

	public  void sendMessage(String message) {
		System.out.println("<" + displayName + "> is sending <" + message);
	}

	public void changeStatus(String status) {
		this.status = status;
	}
}

class StudentUser extends SlackUser {

	int groupNum;

	public StudentUser(String displayName, int timeZone, String status, int groupNum) {
		super(displayName, timeZone, status);
//		this.groupNum = groupNum;
//		this.timeZone = timeZone;
//		this.status = status;
	}

	
	
	public String toString() {
		return "StudentUser[GroupNumber=" + groupNum + ", displayName=" +  ", timeZone=" + timeZone
				+ ", status= " + status + "]";
	}

}

class AdminUser extends SlackUser {
int adminLevel;


	public AdminUser(String displayName, int timeZone, String status, int adminLevel) {
		super(displayName,timeZone,status);
//		this.displayName = displayName;
//		this.status = status;
//		this.timeZone=timeZone;	
		this.adminLevel = adminLevel;
		
	}
	

	@Override
	public String toString() {
		return "AdminUser[Admin Level=" + adminLevel + ", displayName=" +displayName+ 
				", timeZone=" + timeZone + ", status= " + status + "]";
	}
}