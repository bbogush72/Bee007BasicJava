package day49;


//if a class does not extends another class explicitly 
//it will extends a class called Object implicitly 

public class Employee extends Object{

	private String title;
	private int id;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// we are overriding the toString method of 
	// the Object class so we can get our own message 
	// rather that hashcodes that returned from 
	// Object class version of toString method
	@Override // This is called annotation @Something
	public String toString() {
		return "spartan";
	}
}