package stock;

public class Product {
   
	private String name;
	private double price;
	private int quantity;
	
	public  Product() {
		
	}

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product Data: " + getName() + ", Price: " + getPrice() + ", Quantity: " + getQuantity() + ", Total: " + TotalValueInStock();
	}
	public double TotalValueInStock() {
		return getPrice() * getQuantity();
	}
	
	public void AddProducts(int quantity) {
		this.quantity += quantity;
	}
	public void RemoveProducts(int quantity) {
		this.quantity-= quantity;
	}
	
	
	
	
	
	
	
	


	
	
	
}
