package day51;
/*
 SlackUser
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



public class StudentUser extends SlackUser {
	/*
	 * String displayName; int timeZone; String status;
	 */
	int groupNumber;

	public static void main(String[] args) {

		// StudentUser s1 = new StudentUser();

		StudentUser s2 = new StudentUser("Snail", 6, "available", 2);
		System.out.println(s2);
		
		AdminUser admin1 = new AdminUser("Snail2",6, "not", 2);
		//(String displayName, int timezone, String status, int adminLevel)
		

	}

	public StudentUser() {
		super();
		System.out.println("Student User no arg");
	}

	public StudentUser(String displayName, int timeZone, String status, int groupNumber) {
		// super();
//      this.displayName = displayName;
//      this.timeZone = timeZone;
//      this.status = status;
		super(displayName, timeZone, status);
		this.groupNumber = groupNumber;
	}

	public String toString() {
		return "StudentUser [groupNumber=" + groupNumber + ", displayName=" + displayName + ", timeZone=" + timeZone
				+ ", status=" + status + "]";
	}
	
	

	/*
	 * public void sendMessage(String message) {
	 * 
	 * System.out.println("<"+displayName+"> is sending <" + message+">" );
	 * 
	 * }
	 * 
	 * public void changeStatus(String status) { this.status = status; }
	 */


int adminLevel;
public void AdminUser(String displayName, int timezone, String status, int adminLevel) {
	
	this.displayName = displayName;
	this.timeZone = timezone;
	this.status = status;
	this.adminLevel=adminLevel;

}

 
public String toAdminString() {
	return "AdminUser [adminLevel=" + adminLevel + ", displayName=" + displayName + ", timezone=" + timeZone
			+ ", status=" + status + "]";
}

}