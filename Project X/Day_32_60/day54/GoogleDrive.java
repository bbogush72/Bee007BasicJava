package day54;

public class GoogleDrive extends CloudStorage {
	  private boolean hasGmail;

	  public GoogleDrive(int capacity, double price, String username, String password, boolean hasGmail) {
	    super(capacity, price, username, password);
	    this.hasGmail = hasGmail;
	  }
	  
	  public void printInfo(int i) { // not overriding any more, because original method has different signature. 
	    System.out.println("Info about cloud storage.."); // it's no overloading, just different method
	  }
	  
	  public static void changeRegion(String region){
	    System.out.println("GoogleDrive class!");
	    CloudStorage.region = region;
	  }

	  @Override
	  public String toString() {
	    return "GoogleDrive [capacity=" + getCapacity() + ", price=" + getPrice() + ", username=" + getUsername()
	        + ", password=" + getPassword() + ", hasGmail=" + hasGmail + "]";
	  }

	}
