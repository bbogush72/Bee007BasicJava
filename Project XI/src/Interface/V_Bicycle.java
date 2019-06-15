package Interface;

public class V_Bicycle implements Vehicle {
	int speed;
	int gear;
	
	//gotta change the gear
	
	@Override
	public void changeGear(int newGear)
	{
		this.gear = newGear;
	}

	//gotta go faster
	@Override
	public void speedUp(int increment)
	{
		this.speed= speed + increment;
	}
	
	//brakes on
	@Override
	public void brakeNow(int decrement)
	{
		this.speed = speed - decrement;
	}
	
	
	public void printBicycle() {
		System.out.println("bicycle speed: "+ speed+ " gear: "+ gear);
		
	}
}
