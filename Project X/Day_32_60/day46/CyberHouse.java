package day46;

public class CyberHouse {
	
	int houseNum;
	String design;
	//static field/variable
	// we can change the default value if needed
	// change it like instance variable.
	static String neighborhoodName;
	
	public CyberHouse(int houseNum, String design)
	{
		this.houseNum=houseNum;
		this.design=design;
	}
}
