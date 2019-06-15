package PolymorphismJ;

public class MountainBike extends Bike {
	private String suspension;
	
	public MountainBike(int startPedaling, int startSpeed, int startGear, String suspensionType) {
		
		
		super(startGear, startGear, startGear);
		this.setSuspension(suspensionType);
	 }
	public String getSuspension() {
		return this.suspension();
	}
	private String suspension() {
		
		return null;
	}
	public void setSuspension() {
		this.setSuspension(suspension());
	}

	public void setSuspension(String suspensionType) {
		this.suspension= suspensionType;
	}
	
	//Note the overridden printDescription method. 
	 public void printDescription() {
	        super.printDescription();
	        System.out.println("The " + "MountainBike has a " +
	            getSuspension() + " suspension.");
	    }
}
