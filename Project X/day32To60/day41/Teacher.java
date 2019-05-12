package day41;

public class Teacher {
	String name;
	int age;
	long ssn;
	int batchNumber;
	String specialty;
	// provide setters and getters
	// create method print info

	public void setName(String n) {
		n = name;
	}
	public String getName() {
		return name;
	}
	public void setSsn(long social) {
		social =ssn;
	}
	public long getSsn(){
		return ssn;
	}
	public void setBatchNumber(int batchNo) {
		batchNo=batchNumber;
	}
	public int getBatchNumber() {
		return batchNumber;
	}
	public void setAge(int a) {
		a=age;
	}
	public int getAge() {
		
		return age;
	}
	public void setSpecialty(String field) {
		field= specialty;
	}
	
	public String getSpecialty() {
		return specialty;
	}

}
