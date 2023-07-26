package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	private Date moment;
	private OrderStatus status;

	private Client client;
	private List<OrderItem> items = new ArrayList<>();

	public Order() {

	}

	public Order(Client client) {
		this.moment = new Date();
		this.status = OrderStatus.PROCESSING;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}

	public void removeItem(OrderItem item) {
		items.remove(item);
	}

	public double total() {
		double sum = 0.0;
		for (OrderItem orderItem : items) {
			sum += orderItem.subTotal();
		}
		return sum;
	}

	@Override
	public String toString() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String item;
		Double sum = 0.0;
		item = "ORDER SUMMARY: " + "\nOrder moment: " + moment + "\nOrder status: " + status + "\n" + "\nClient: \n"
				+ client.getName() + "(" + dateFormat.format(moment) + ")" + " - " + client.getEmail()
				+ "\nOrder items: \n";

		for (OrderItem orderItem : items) {
			item += "Name: " +orderItem.getProduct().getName() + ", $" + orderItem.getProduct().getPrice() + ", Quantity: "
					+ orderItem.getQuantity() + ", Subtotal: " + orderItem.subTotal() + "\n";
			sum += orderItem.subTotal();
		}
		item += "Total price: " + sum;

		return item;
	}

}
