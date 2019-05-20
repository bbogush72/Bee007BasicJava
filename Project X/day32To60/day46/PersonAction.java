package day46;

public class PersonAction {

	public static void main(String[] args) {

		Person p1 = new Person("Mysterion", 5.7f, 'M');
		Person p2 = new Person("Hybridion", 6.7f, 'M');
		Person p3 = new Person("Mysteron", 6.7f, 'M');
		
		//static way to access static variable
		System.out.println(Person.getRace());
		
		//non static way to access static variable, highly NOT recommended
		System.out.println(p1.getRace());
		
		
		Person.setRace("Ferengi");
		System.out.println(p2.getRace());
		
		//race is static, and if you change it, it will change for all other objects
		p2.setRace("Vulcan");
		System.out.println(p1.getRace());
		
		
		System.out.println(p1.name+" "+ p1.height+ " "+ p1.gender+ " "+ p1.getRace());
		System.out.println(p2.name+" "+ p2.height+ " "+ p2.gender+ " "+ p2.getRace());
		
		//counter counts how many objects there
		// if you remove static keyword, then it will only point to whichever object assigned
		System.out.println(p3.counter);
		System.out.println(Person.counter);
	}

}
