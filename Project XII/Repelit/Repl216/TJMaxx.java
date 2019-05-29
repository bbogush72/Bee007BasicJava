package Repl216;

import java.util.ArrayList;
import java.util.List;

/**
 * represents TJMaxx store class. https://tjmaxx.com/
 */
public class TJMaxx extends Item{

	

	public TJMaxx(String name, int quantity, int catalogNumber, double price) {
		super(name, quantity, catalogNumber, price);


	}

	/**
	 * Private lists to hold regular Item objects and OnSaleItem objects that
	 * represent items that sell in TJMaxx
	 */
	private  List<Item> regularItems;
	private  List<OnSaleItem> OnSaleItems;

	/**
	 * Public no-args constructor - Instantiates regularItems and onSaleItems lists
	 * as new ArrayList
	 */
	 int countSale = 0;
	int countRegular = 0;
	

//	public TJMaxx() {
//		// TODO
//
//	}

	/**
	 * adds an item object to regularItems list
	 * 
	 * @param Item
	 */
	public void addRegularItem(Item Item) {
		
		regularItems.add(Item);

	}

	/**
	 * adds OnSaleItem object to onSaleItems list
	 * 
	 * @param item
	 */
	public void addOnSaleItem(OnSaleItem item) {
		countSale++;
		OnSaleItems.add(item);
	}

	/**
	 * getter for regularItems
	 * 
	 * @return
	 */
	public List<Item> getRegularItems() {
		// TODO change from null
		countRegular++;
		return regularItems;
	}

	/**
	 * getter for onSaleItems
	 * 
	 * @return
	 */
	public List<OnSaleItem> getOnSaleItems() {
		// TODO change from null
		return OnSaleItems;
	}

	/**
	 * return count of regularItem object
	 * 
	 * @return
	 */
	public int regularItemsCount() {
		// TODO change from -1

		return countRegular;
	}

	/**
	 * returns count of onSaleItems in TJ Maxx
	 * 
	 * @return
	 */
	public int onSaleItemsCount() {
		// TODO change from -1
		return countSale;
	}

	/**
	 * returns the name of each item in TJ Maxx starting from regular item then
	 * onSaleItems
	 * 
	 * @return
	 */
	public List<String> getAllItemNames() {

		List<String> allList = new ArrayList<>();
		for (Item each : regularItems) {

			allList.add(each.getName());
		}
		for (OnSaleItem each : OnSaleItems) {

			allList.add(each.getName());
		}

		return allList;
	}

	/**
	 * gets catalog number and returns price for the item it will search for the
	 * item both regularItems and onsaleonSaleItems
	 * 
	 * @param catalogNumber
	 * @returns 0.0 if product cannot be found with that catalognumber
	 */
	public double getItemPrice(int catalogNumber) {

		for (Item each : regularItems) {

			if(each.getCatalogNumber()==(catalogNumber))
			{
				return each.getPrice();
			}
		}
		for (OnSaleItem each : OnSaleItems) {

			if (each.getCatalogNumber()==(catalogNumber))
			{
				return each.getPrice();
			}
		}
		return 0.0;
	}

	/**
	 * accepts a name then searches amoung onSaleItems. Once it finds, the method
	 * will return that OnSaleItem object
	 * 
	 * @param name
	 * @return
	 */
	public OnSaleItem getOnSaleItem(String name) {
		for (OnSaleItem each : OnSaleItems) 
		{

			if (each.getName().equals(name))
			{
				return each;
			}
		
		}
		return null;
		}

	/**
	 * removes the item with matching catalogNumber from both regularItems and
	 * onSaleItems. Does nothing if not found
	 * 
	 * @param catalogNumber
	 */
	public void removeItem(int catalogNumber) {
		for (Item each : regularItems) {

			if(each.getCatalogNumber()==(catalogNumber))
			{
				regularItems.remove(each);
			
			}
		}
		for (OnSaleItem each : OnSaleItems) {

			if (each.getCatalogNumber()==(catalogNumber))
			{
				OnSaleItems.remove(each);
			}
		}
		
		
		
		
	}

	/**
	 * - it accepts a catalog number and finds that item among regularItems and
	 * onSaleItems - if it finds the item: - decrease the count of the Item by 1 -
	 * if count reaches 0 after decrementing then remove the product(call removeItem method)
	 *
	 * @param catalogNumber
	 */
	public void buyItem(int catalogNumber) {
		for (Item each : regularItems) 
		{

			if(each.getCatalogNumber()==(catalogNumber))
			{
				countRegular--;
			
			}
		
		
			if(countRegular==0) 
			{
				this.removeItem(each.getCatalogNumber());
			
			}
		}
		for (OnSaleItem each : OnSaleItems) {

			if (each.getCatalogNumber()==(catalogNumber))
			{
				countSale--;
				
			}
			if(countSale==0) 
			{
				this.removeItem(each.getCatalogNumber());
			
			}
		}
	}
	
	public static void main(String[] args) {

		Item i1= new Item("Tshirt", 32, 101, 15.0);
		Item i2= new Item("hat", 30, 103, 12.0);
		Item i3= new Item("pant", 28, 104, 14.0);
		Item i4= new Item("jacket", 26, 105, 17.0);
		Item i5= new Item("Scarf", 36, 106, 18.0);

		//addRegularItem(i1);
		
		
	
		System.out.println(i1.toString());
		
		
	}
	
	

}
