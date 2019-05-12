package day41;

public class Ac {
	private static final String tempareture = null;
	//we have to provide instance variables
	//that will describe AC
	//instance variables
	String brand;
	float temperature;
	String mode;
	String color;
	boolean remoteControl;
	float price;
	boolean isOn;
	int ecoLevel;
	String season;
	
	
	//this is instance method
	public void displayBrand() {
		System.out.println("The brand is: "+brand);
	}
	
	public void showCurrentTemperature() {
		System.out.println("Current temperature: "+temperature);
	}
	
	public void increaseTemperature(float temp) {
		temperature = temperature + temp;
	}
	
	public void decreaseTemperature(float temp) {
		temperature = temperature - temp;
	}
	
	public void turnOn(){
		if(isOn==false) {
			System.out.println("AC is on");
		}else {
			System.out.println("AC is alredy on!!!");
		}
	}
	
	public void turnOff(){
		if(isOn==true) {
			System.out.println("AC is off");
		}else {
			System.out.println("AC is alredy off!!!");
		}
	}
	public void getEcoLevel() {
		System.out.println("Eco level is"+ ecoLevel);
	}
	
	public void displayPrice() {
		System.out.println("Price: "+price);
	}
	
	public void remoteControl() {
		System.out.println("Remote control: "+ remoteControl);
	}
	public void setMode(String mode) {
		switch(season) {
		case "cool":
			mode="@@@Summer@@@";
			break;
		case "Winter" :
			mode="heat";
			System.out.println("****Winter mode!****");
			break;
		default :
			System.out.println("Wrong mode");
		}
	}
	public void printInfo() {
		System.out.println("Brand: "+brand+"Current Temp: "
	+tempareture+" mode: "+mode+" Color: " +color+ " Eco Level: "+ecoLevel+
	"Price: "+ price + " has Remote: "+ remoteControl+ ", isOn"+isOn);
	}
	
	
}


