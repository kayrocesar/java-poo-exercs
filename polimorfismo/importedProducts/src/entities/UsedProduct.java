package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{

	private Date manufactureDate;
	
	
	public UsedProduct() {
		super();
	}
	
	public UsedProduct(String name, double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}


    @Override
	public String priceTag() {
    	SimpleDateFormat simpleDate = new SimpleDateFormat("dd/MM/yyyy");
    	
		return super.priceTag() + " (used) - Manufacture date: " + simpleDate.format(manufactureDate);
	}
}
