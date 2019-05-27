package repel1;

import java.util.ArrayList;
import java.util.List;

/**
 * represents TJMaxx store class. https://tjmaxx.com/
 */
public class _216_TJMaxx extends _216_Item{

	

	public _216_TJMaxx(String name, int quantity, int catalogNumber, double price) {
		super(name, quantity, catalogNumber, price);


	}

	/**
	 * Private lists to hold regular Item objects and OnSaleItem objects that
	 * represent items that sell in TJMaxx
	 */
	private List<_216_Item> regularItems;
	private List<_216_OnSaleItem> _216_OnSaleItems;

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
	 * @param _216_Item
	 */
	public void addRegularItem(_216_Item _216_Item) {
		regularItems.add(_216_Item);

	}

	/**
	 * adds OnSaleItem object to onSaleItems list
	 * 
	 * @param item
	 */
	public void addOnSaleItem(_216_OnSaleItem item) {
		countSale++;
		_216_OnSaleItems.add(item);
	}

	/**
	 * getter for regularItems
	 * 
	 * @return
	 */
	public List<_216_Item> getRegularItems() {
		// TODO change from null
		countRegular++;
		return regularItems;
	}

	/**
	 * getter for onSaleItems
	 * 
	 * @return
	 */
	public List<_216_OnSaleItem> getOnSaleItems() {
		// TODO change from null
		return _216_OnSaleItems;
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
		for (_216_Item each : regularItems) {

			allList.add(each.getName());
		}
		for (_216_OnSaleItem each : _216_OnSaleItems) {

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

		for (_216_Item each : regularItems) {

			if(each.getCatalogNumber()==(catalogNumber))
			{
				return each.getPrice();
			}
		}
		for (_216_OnSaleItem each : _216_OnSaleItems) {

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
	public _216_OnSaleItem getOnSaleItem(String name) {
		for (_216_OnSaleItem each : _216_OnSaleItems) 
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
		for (_216_Item each : regularItems) {

			if(each.getCatalogNumber()==(catalogNumber))
			{
				regularItems.remove(each);
			
			}
		}
		for (_216_OnSaleItem each : _216_OnSaleItems) {

			if (each.getCatalogNumber()==(catalogNumber))
			{
				_216_OnSaleItems.remove(each);
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
		for (_216_Item each : regularItems) 
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
		for (_216_OnSaleItem each : _216_OnSaleItems) {

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

}
