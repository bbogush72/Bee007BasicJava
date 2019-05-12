package day41;

public class ACcheck {

	public static void main(String[] args) {
		
		Ac AirCond1 = new Ac();
		AirCond1.brand = "Samsing";
		AirCond1.color = "White";
		AirCond1.ecoLevel = 10;
		AirCond1.price = 5000;
		AirCond1.mode = "heat";
		AirCond1.color = "White";
		AirCond1.temperature= 75;
		
		AirCond1.turnOff();
		AirCond1.turnOn();
		AirCond1.printInfo();
	}
}