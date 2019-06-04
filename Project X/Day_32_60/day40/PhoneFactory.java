package day40;

public class PhoneFactory {
	public static void main(String[] args) {
		Phone iphone = new Phone();

		// how we are accessing instance fields
		// or instance variables
		// object - it's an instance of class
		// in this case, iphone it's an object of Phone class
		// we are defining values of instance variables
		// only for this particular object
		iphone.brand = "Apple";
		iphone.model = "Iphone XS";
		iphone.OS = "IOS";
		iphone.color = "Rose Gold";
		iphone.storageSize = 256;
		iphone.isWaterResistant = true;
		// no let's check what this iphone has
		System.out.println(iphone.brand);
		// it will display this message:Phone is ringing
		iphone.ring();
		iphone.call();
		iphone.sendSMS("Hello World!", 5718930234L);
		iphone.dial(5718930234L);
	

	}

	// add you own methods to the Phone class
	// I cannot do like this: Phone.ring();
	// It's not valid, because it's not a static method
	// I have to create an object, before accessing these methods
	// and instance fields
	// static methods, variables -> belong to class
}
