package day47;

public class WaterBottle {
	private String brand;
	private boolean empty;

	public static void main(String[] args) {
		//create an object
		WaterBottle wb = new WaterBottle();
		
		//wb.empty returns the default value of boolean that is false
		System.out.print("Empty = " + wb.empty);
		// wb.brand returns null because default value of String is null
		System.out.print(", Brand = " + wb.brand);
	}
}
