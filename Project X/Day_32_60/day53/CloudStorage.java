package day53;

public class CloudStorage {
	private int capacity;
	private double price;
	private String userName;
	private String password;
	
	public CloudStorage(int capacity, double price, String userName, String password)
	{
		this.capacity=capacity;
		this.password=password;
		this.price=price;
		this.userName=userName;
	}
	final public void printInfo()
	{
		System.out.println("Cloud storage info");
	}
	final public void printInfo(String name)
	{
		System.out.println("Cloud storage info 2");
	}
	
	
	public int getCapacity()
	{
		return capacity;
	}
	public void setCapacity(int capacity)
	{
		this.capacity=capacity;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password=password;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public String getUserName()
	{
		return userName;
	}
	public void setUserName(String userName)
	{
		this.userName=userName;
	}
	@Override
	  public String toString() {
	    return "CloudStorage [capacity=" + capacity + ", price=" + price + ", username=" + userName + ", password="
	        + password + "]";
	  }
	
}
