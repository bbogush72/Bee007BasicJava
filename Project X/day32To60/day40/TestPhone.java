package day40;

public class TestPhone {

	public static void main(String[] args) {

		Phone phone1 = new Phone();
		Phone phone2 = new Phone();
		Phone phone3 = new Phone();
		
		
		phone1.brand = "Apple";
		phone1.model="iPhone Xs";
		phone1.camera = 5;
		phone1.color="red";
		phone1.cpu=1.9;
		phone1.isWaterResistant= true;
		phone1.screenSize=4.9;
		phone1.supports5G=true;
		
		phone1.ram = 64;
	
		phone2.brand = "Google";
		phone2.model="Nexus";
		phone2.camera = 4;
		phone2.color="yellow";
		phone2.cpu=1.8;
		phone2.isWaterResistant= false;
		phone2.screenSize=4.9;
		phone2.supports5G=false;
		
		phone2.ram = 8;
		
		phone3.brand = "Samsung";
		phone3.model="Galaxy 10";
		phone3.camera = 4;
		phone3.color="blue";
		phone3.cpu=2.9;
		phone3.isWaterResistant= true;
		phone3.screenSize=4.9;
		phone3.supports5G=true;
		phone3.ram = 32;
		
		
		
		System.out.println("Phone 1 is an "+phone1.brand +" "+ phone1.model);
		System.out.println("Phone 2 is an "+phone2.brand +" "+ phone2.model);
		System.out.println("Phone 2 is an "+phone3.brand +" "+ phone3.model);
		
		System.out.println();
		
		phone1.ring();
		phone1.call();
		phone2.ring();
		phone2.call();
		
		phone2.dial(2144557398);
		phone1.dial(2144557398);
		
		phone1.sendSMS("In time we prevail ", 2144839933);
		phone2.sendSMS("Stay strong we will ", 2144839933);
		phone3.sendSMS("time to deep thinking", 2140002221);
		
		
	}

}
