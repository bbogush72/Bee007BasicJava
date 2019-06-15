package day58;


import java.util.ArrayList;
import java.util.List;

import day59.Drawable;

public class testShapes {

	
	public static void main(String[] args) {
		_Triangle t1 = new _Triangle("red",5,10);
		_Square s1 = new _Square("red",5);
		Drawable d1 = new _Square("red",5);
		Drawable d2 = new _Triangle("red",5,5);
		Drawable d3 = new _Triangle("red",5,5);
		Drawable d4 = new _Square("Green",5);
		d1.draw();
		d2.draw();
		d3.draw();
		d4.draw();
		

		List<Drawable> DrawbleShapes = new  ArrayList<>();
		DrawbleShapes.add(d1);
		DrawbleShapes.add(d2);
		DrawbleShapes.add(d3);
		DrawbleShapes.add(d4);
		
		
		
		for(Drawable each: DrawbleShapes) {
			each.draw();
		}
		
		
		
		
	}
}
