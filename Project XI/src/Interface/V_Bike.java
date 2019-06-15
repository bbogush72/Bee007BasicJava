package Interface;

public class V_Bike implements Vehicle {
	int speed;
	int gear;
	
	@Override
	public void changeGear(int newGear)
	{
		this.gear = newGear;
	}
	
	@Override
	public void speedUp(int increment)
	{
		this.speed = speed + increment;
	}
	
	@Override
	public void brakeNow(int decrement)
	{
		this.speed = speed - decrement;
	}
	
	public void printBike()
	{
		System.out.println("bike speed: "+ speed + " gear: "+ gear);
	}
}
