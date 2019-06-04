package day40;

public class Pc {
	// unknown it's a default value for type instance variable (property)
	// later we can change default values, if they are not final
	public String type = "unknown";
	int ram;
	double screenSize;
	String color;
	String OS;
	boolean isPersonal;

	public void printInfo() {
		System.out.println("Type: " + type + ", OS: " + OS + ","
				+ " Color: " + color + ", Ram: " + ram + "GB, Personal? "
				+ isPersonal);
	}
}