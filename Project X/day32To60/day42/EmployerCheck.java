package day42;

import java.util.ArrayList;

public class EmployerCheck {

	public static void main(String[] args) {

		Employee Snail1 = new Employee();

		Snail1.age = 36;
		Snail1.name = "snail1";
		Snail1.salary = 200000;
		Snail1.title = "Scavenger";

		// SnailMail.printAll();

		Employee Snail2 = new Employee();
		Snail2.age = 33;
		Snail2.name = "snail2";
		Snail2.salary = 100000;
		Snail2.title = "Scanvenger and collector";

		// Snail2.printAll();

		ArrayList<String> names = new ArrayList<>();

		ArrayList<Employee> myPeople = new ArrayList<>();
		myPeople.add(Snail1);
		myPeople.add(Snail2);
		myPeople.add(new Employee());

		// System.out.println(myPeople.size());

		Employee firstItem = myPeople.get(0);
		// firstItem.printAll();

		System.out.println();

		Employee secondItem = myPeople.get(1);
		// secondItem.printAll();
		
		
		
		int count = 0;
		for (int i = 0; i < myPeople.size(); i++) {
			Employee each = myPeople.get(i);

			if (each.age > 30 && each.salary > 150000) {
				 each.printAll(); //or
			//	myPeople.get(i).printAll();
				count++;
				
			}

		}
		System.out.println("Total employess fit the description: " + count);
		
		String name = "";
		for(int i=0; i<myPeople.size(); i++) {
			Employee each= myPeople.get(i);
			if(each.age>25) {
				name= name+ each.name+ " ";
				
			}
			
		}
		System.out.println("Names whose age is more than 25: "+name);
		
	}

}