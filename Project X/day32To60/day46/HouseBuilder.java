package day46;

public class HouseBuilder {

	public static void main(String[] args) {

		CyberHouse  h1 = new CyberHouse(1, "valedictorian");
		CyberHouse h2 = new CyberHouse(2, "single family");
		//accessing static variable
		//we access static members using static way
		//className.staticFieldName
		//cassName.
		CyberHouse.neighborhoodName= "cybertek corner";
		
		System.out.println(   CyberHouse.neighborhoodName   );
		
		//changing variable value of static way, change will affect all objects 
		CyberHouse.neighborhoodName= "CyberTek street";
		
		System.out.println(   CyberHouse.neighborhoodName   );
		
		//access instance variables/objects
		System.out.println(h1.neighborhoodName);
		System.out.println(h2.neighborhoodName);
		
		//changing instance variable value of object
		//does not affect another object
		h1.houseNum= 100;
		h1.neighborhoodName="Cybertek tower";
		System.out.println(h2.neighborhoodName);
		
		
		System.out.println(h1.houseNum);
		System.out.println(h2.houseNum);
	}

}
