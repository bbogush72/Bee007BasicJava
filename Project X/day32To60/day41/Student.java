package day41;
public class Student {
	String name;
	private int age;
	private long ssn;
	protected int batchNumber;
	public String major;

	public void setName(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	public void setAge(int a) {
		age = a;
	}

	public int getAge() {
		return age;
	}

	public void setSSN(long a) {
		ssn = a;
	}

	public long getSSN() {
		return ssn;
	}

	public void setBatchNumber(int a) {
		batchNumber = a;
	}

	public int getBatchNumber() {
		return batchNumber;
	}

	public void setMajor(String n) {
		major = n;
	}

	public String getMajor() {
		return major;
	}
}