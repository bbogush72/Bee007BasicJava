package Interface;

public class V_Main {
	public static void main(String[] args) {

		
		
		V_Bicycle bic1 = new V_Bicycle();
		bic1.changeGear(2);
		bic1.speedUp(10);
		bic1.brakeNow(6);
		
		bic1.printBicycle(); //returns the final speed and gear
		
		V_Bike bike1 = new V_Bike();
		bike1.changeGear(4);
		bike1.speedUp(80);
		bike1.brakeNow(60);
		
		bike1.printBike(); //returns the final speed and gear
	}
}
