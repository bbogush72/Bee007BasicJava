package day39;
import java.util.*;


public class Snail {

	public static void main(String[] args) {
		
		
		Snail1 s1 = new Snail1();
		Snail1 s2 = new Snail1();
		
		//each object attributes are completly independent from 
		//objects any other 
		
		s1.age= 0.8;
		s1.breed="mystery";
		s1.color="blue";
		s1.height= 1.1;
		s1.type = "hunter";
		
		
		s2.age= 0.1;
		s2.breed="pond";
		s2.color="brown";
		s2.height= 0.8;
		s2.type = "scavenger";
		
		
		
		
		
		System.out.println("Snail1 age: "+s1.age + "| type: "+ s1.type);
		System.out.println("Snail2 age: "+s2.age + "| type: "+ s2.type);
		
		
		//reassign new value to s1 and s2
		s1.age =0.9;
		System.out.println("Snail1 age changed: "+s1.age);
	}


}
