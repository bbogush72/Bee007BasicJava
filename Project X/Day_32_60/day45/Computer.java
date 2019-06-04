package day45;
public class Computer {
	  //instance variables
	  private String brand;
	  private String cpu;
	  private int harddrive;
	  private double screenSize;
	  private int ram;
	  private boolean isTouchScreen;
	  private String os;
	  private double price;

	  // this not a default constructor
	  // because default is invisible, and it exists before you create yours.
	  // this is non-arguments constructor.
	  public Computer() {
		// constructor changing here
		// 
		 this("acer", "intel celeron");
//	    this.brand = "unknown";
//	    this.cpu = "unknown";
//	    this.os = "bios";
	    System.out.println("No args constructor called!");
	  }

	  // this constructor with default access modifier.
	  // why ? just for fun. because it's legal.
	  // you can have constructors with no access modifier
	  Computer(String brand, String cpu, int harddrive, double screenSize, int ram, boolean isTouchScreen, String os,double price) {
	    this.brand = brand;
	    this.cpu = cpu;
	    this.harddrive = harddrive;
	    this.screenSize = screenSize;
	    this.ram = ram;
	    this.isTouchScreen = isTouchScreen;
	    this.os = os;
	    this.price = price;
	    System.out.println("Big boss (with all parameters) constructor called!");
	  }

	  private Computer(String brand, String cpu) {
	    this.brand = brand;
	    this.cpu = cpu;
	    System.out.println("Hidden constructor called!");
	  }
	  
	  @Override
	  public String toString() {
	    return "Computer [brand=" + brand + ", cpu=" + cpu + ", harddrive=" + harddrive + ", screenSize=" + screenSize
	        + ", ram=" + ram + ", isTouchScreen=" + isTouchScreen + ", os=" + os + ", price=" + price + "]";
	  }

	}
