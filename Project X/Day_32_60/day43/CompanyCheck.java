package day43;

import java.util.ArrayList;

public class CompanyCheck {

	public static void main(String[] args) {
		
		//Create objects
		
		Company staff1 = new Company();
		staff1.name= "Ozlem";
		staff1.age = 25;
		staff1.salary = 160000.5;
		staff1.title = "Scrum Master";
		//print all info for staff1
			//staff1.printAll();
		
		Company staff2 = new Company();
		staff2.name= "Fatma";
		staff2.age = 20;
		staff2.salary = 150000.9;
		staff2.title = "Product Owner";
		//print all info for staff2
			//	staff2.printAll();
		
		Company staff3 = new Company();
		staff3.name= "Emine";
		staff3.age = 20;
		staff3.salary = 160000.5;
		staff3.title = "Tester and Team Lead";
		//print all info for staff1
			//	staff3.printAll();
		
		Company staff4 = new Company();
		staff4.name= "Bunyamin";
		staff4.age = 30;
		staff4.salary = 100000.1;
		staff4.title = "tester";
		//print all info for staff1
			//	staff4.printAll();
		
		
		ArrayList<Company> staff = new ArrayList<>();
		staff.add(staff1);
		staff.add(staff2);
		staff.add(staff3);
		staff.add(staff4);
		
		// find names of who gets more than 120000
//		for(Company each : staff) {
//			if(each.salary>120000) {
//				each.printAll();
//		}
//		}
		
		for(int i=0; i< staff.size(); i++) {
		Company each = staff.get(i);
		//each.printAll();
		if(each.salary>120000) {
		//	each.printAll();
			System.out.println(each.name+ " " + each.salary);
		}
	}
		
		
	}

}
