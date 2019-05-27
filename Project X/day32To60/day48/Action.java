package day48;

public class Action {

	public static void main(String[] args) {
		Person person1= new Person("Ozlem",27, 5.4f, 'F');
		Person person2= new Person("Oz",25, 5.6f, 'F');
		
		//when we need to access static members
		// use ClassName.static member(anything starts with static)
		
		int countOfPeople= Person.counter;
		
		//countOfpeople requires update if objects made after the Person.counter
		
		//update countOfPeople
		//countOfPeople= Person.counter;
		
		System.out.println("Count of people listed: "+ countOfPeople);
		//or two more ways that will result the same if variable is static
		System.out.println("Count of people listed: "+ person1.counter);
		System.out.println("Count of people listed: "+ Person.counter);
		
		System.out.println(person1);
		
		
		
		
		
	}

}
