package day53;

public class GoogleDrive extends CloudStorage {
	private boolean hasGmail;
	public GoogleDrive (int capacity, double price, String userName, String password, boolean hasGmail)
	{
		super(capacity, price, userName, password);
		this.hasGmail=hasGmail;
	}
	@Override
	public String toString() {
		return "GoogleDrive [hasGmail=" + hasGmail + ", getCapacity()=" + getCapacity() + ", getPassword()="
				+ getPassword() + ", getPrice()=" + getPrice() + ", getUserName()=" + getUserName() + "]";
	}
	
	
	
}
