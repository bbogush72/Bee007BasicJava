package day42;

import java.util.ArrayList;

public class EmployerAction {

	public static void main(String[] args) {

		Employee SnailMail = new Employee();
		
		SnailMail.age= 2;
		SnailMail.name= "S.N";
		SnailMail.salary= 8.1;
		SnailMail.title="Scavenger";
		
		//SnailMail.printAll();

		
		Employee Snail2=new Employee();
		Snail2.age=3;
		Snail2.name="Snail S2";
		Snail2.salary=4.0;
		Snail2.title="Scanvenger and collector";
		
		
		//Snail2.printAll();
		
		ArrayList<String> names = new ArrayList<>();
		
		ArrayList<Employee> myPeople = new ArrayList<>();
		myPeople.add(Snail2);
		myPeople.add(SnailMail);
		myPeople.add(new  Employee());
		
		//System.out.println(myPeople.size());
		
		Employee firstItem = myPeople.get(0);
	//	firstItem.printAll();
		
		System.out.println();
		
		Employee secondItem = myPeople.get(1);
	//	secondItem.printAll();
		
		for(int i=0; i<myPeople.size(); i++ ) {
			Employee each = myPeople.get(i);
			
			//each.printAll(); or
			myPeople.get(i).printAll();
		}
		
	}

}
