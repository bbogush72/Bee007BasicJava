package PolymorphismJ;

public class TestBikes {

	public static void main(String[] args) {
		Bike bike01, bike02, bike03;

	    bike01 = new Bike(20, 10, 1);
	    bike02 = new MountainBike(20, 10, 5, "Dual");
	    bike03 = new RoadBike(40, 20, 8);

	    bike01.printDescription();
//	    bike02.printDescription();
//	    bike03.printDescription();
	}

}
