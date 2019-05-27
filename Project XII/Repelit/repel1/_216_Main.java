package repel1;

public class _216_Main{

	public static void main(String[] args) {

		_216_Item i1= new _216_Item("Tshirt", 32, 101, 15.0);
		_216_Item i2= new _216_Item("hat", 30, 103, 12.0);
		_216_Item i3= new _216_Item("pant", 28, 104, 14.0);
		_216_Item i4= new _216_Item("jacket", 26, 105, 17.0);
		_216_Item i5= new _216_Item("Scarf", 36, 106, 18.0);

		addRegularItem(i1);
		
		addOnSaleItem(i2);
	
		System.out.println(i1.toString());
	}




}
