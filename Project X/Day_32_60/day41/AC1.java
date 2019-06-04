package day41;

public class AC1 {
	// we have to provide instance variables
	// that will describe AC
	// instance variables
	String brand;
	float temperature;
	String mode;
	String color;
	boolean remoteControl;
	float price;
	boolean isOn;
	int ecoLevel;

	// this is instance method
	public void displayBrand() {
		System.out.println("The brand is: " + brand);
	}

	public void showCurrentTemperature() {
		System.out.println("Current temperature: " + temperature);
	}

	public void increaseTemperature(float temp) {
		temperature = temperature + temp;
	}

	public void decreaseTemperature(float temp) {
		temperature = temperature - temp;
	}

	public void turnOn() {
		// we are checking if ac is off
		if (isOn == false) {
			// changing status....
			// set it to true, make it on
			isOn = true;
			System.out.println("AC is on");
		} else {
			// it's already on, no need to turn on again
			System.out.println("AC is alredy on!!!");
		}
	}

	public void turnOff() {
		if (isOn == true) {
			// changing status....
			// set it to false, make it off
			isOn = false;
			System.out.println("AC is off");
		} else {
			// it's already off, no need to turn off again
			System.out.println("AC is alredy off!!!");
		}
	}

	public void getEcoLevel() {
		System.out.println("Eco level is: " + ecoLevel);
	}

	public void displayPrice() {
		System.out.println("Price: " + price);
	}

	public void remoteControlAvailability() {
		System.out.println("Remote control: " + remoteControl);
	}

	public void setMode(String season) {
		switch (season) {
		case "Summer":
			mode = "cool";
			System.out.println("@@@@Summer mode!@@@@");
			break;
		case "Winter":
			mode = "heat";
			System.out.println("****Winter mode!****");
			break;
		default:
			System.out.println("Wrong mode!");
		}
	}

	// this method will provide full description about AC
	public void printInfo() {
		System.out.println("Brand: " + brand + ", Current temperature: " 
						+ temperature + ", Mode: " + mode+", Color: "+color
						+", Eco level: "+ecoLevel+", Price: "+price
						+", Has remote? "+remoteControl+", Is on? "+isOn);
	}

}
