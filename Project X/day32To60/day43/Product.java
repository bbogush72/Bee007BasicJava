package day43;

public class Product {

	/*
	 * Customer should be able to view Product detail noun -->> you can think of a
	 * class Customer name, password,primemeber viewProduct() browse() Product name,
	 * rating, price , item
	 */
	private String name;
	private String item;
	private double price;
	private float rating;
	private String productId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public void initializeAllFieldValues(String name, float rating, 
										 double price, String productId) {
		this.name = name;
		this.rating = rating;
		this.price = price;

		setProductId(productId);// or this.setProductId(productId);
	}

	public void setProductId(String productId) {

	}

	public float getRating() {
		return rating;
		
	}

	public double getPrice() {
		return price;
		
	}


	public String getProductId() {
		return productId;
		
	}

	public void setPrice(double d) {
		
		d = price;
	}

}
