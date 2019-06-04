package day38;

import java.util.ArrayList;

public class ArrayListTask {

	public static void main(String[] args) {

		ArrayList<Integer> Nums1 = new ArrayList <>();
		
		for(int i=1; i<=10; i++) {
			Nums1.add(i);
			
		}
		System.out.println(Nums1);
		
		ArrayList<Integer> Nums2 = new ArrayList <>();
		
		for(int i=10; i>0; i--) {
			Nums2.add(i);
		}
		System.out.println(Nums2);
		
		
		Nums1.addAll(1, Nums2);
		System.out.println(Nums1);
	}

}
