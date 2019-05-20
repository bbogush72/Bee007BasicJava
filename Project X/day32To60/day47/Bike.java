package day47;

public class Bike {
	/*
	 * WARM UP Create a class called Bike private instance fileds : brand, gear,
	 * speed , id private static field : countOfBike
	 * 
	 * provide getters for all instance fields privide setters for brand, gear,
	 * speed
	 * 
	 * create 3 args constructors to set brand, gear, speed and keep the count of
	 * objects here set the id value by the count of object to stimulate incremented
	 * ID for each objects call your no arg constructor in here
	 * 
	 * create private no arg constructor print out no arg is being called create
	 * instance methods speedUp : accept one increaseBy as int return nothing , it
	 * will increase current speed by the amount provided slowdown : accept one
	 * decreaseBy as int return nothing , it will decrease current speed by the
	 * amount provided toString method as usual create static methods
	 * showCurrentCount accept no arg and just print out static variable count
	 */
	private String brand;
	private int gear;
	private int speed;
	private int id;
	static int countOf;

	private Bike() {

		System.out.println("no arg constructor being called");
		++countOf;
		this.id= countOf;
	}
	public Bike(String brand, int gear, int speed) {
		this();
		this.brand=brand;
		this.gear=gear;
		this.speed=speed;
		
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getId() {
		return id;
	}

	public void speedUp(int increaseBy) {

	}

	public void slowDown(int decreeseBy) {

	}

	public String toString() {
		return "Bike [brand=" + brand + ", gear=" + gear + ", speed=" + speed + ", id=" + id + "]";
	}

	public static void showCurrentCount() {
		System.out.println("current count of objects: "+countOf);
	}
	public static void resetCount() {
		countOf=0;
	}
}
