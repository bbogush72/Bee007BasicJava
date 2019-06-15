package PolymorphismJ;

public class Bike {
	private int gear;
	private int cadence;
	private int speed;

	public Bike(int gear, int cadence, int speed) {
		super();
//		this.cadence=cadence;
//		this.gear=gear;
//		this.speed=speed;
//		
		
	}

	public void printDescription(){
	    System.out.println("\nBike is " + "in gear " + this.gear
	        + " with a cadence of " + this.cadence +
	        " and travelling at a speed of " + this.speed + ". ");
	}
}
