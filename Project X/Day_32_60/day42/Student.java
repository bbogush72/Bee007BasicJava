package day42;

//blue print
public class Student {
	//instance variables
	public String name;
	private int age;
	private long ssn;
	protected int batchNumber;
	public String field;
	
	//setter method requires void
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int a) {
		//this.age = age;
		age= a;
	}
	public int getAge() {
		return age;
	}
	public void setSsn(long s) {
		ssn=s;
	}
	public long getSsn() {
		return ssn;
	}
	public void setBatchNumber(int b) {
		batchNumber = b;
	}
	
	
	
	
	
	
	
	
	
	
}
