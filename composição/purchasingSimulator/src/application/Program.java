package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Name: ");
		String name= sc.nextLine();
		System.out.print("Email: ");
		String email=sc.nextLine();
		System.out.print("Birth date (dd/MM/YYYY): ");
		String birthDate= sc.nextLine();
		SimpleDateFormat dateFormat = new  SimpleDateFormat("dd/MM/yyyy");
		Date date=dateFormat.parse(birthDate);
		
		Client client = new Client(name,email,date);
		System.out.println("Enter order data:");
		Order order= new Order(client);
		System.out.println(order.getStatus());
		System.out.print("How many items to this order? ");
		int nItens= sc.nextInt();
		for (int j = 1; j <= nItens; j++) {
			sc.nextLine();
			System.out.println("Enter " +j+ " item data: ");
			System.out.print("Product name: ");
			String productName= sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int productQuantity= sc.nextInt();
			Product product= new Product(productName,productPrice);
		    OrderItem orderItem = new OrderItem(productQuantity,productPrice,product);
		    order.addItem(orderItem);
		    
		    
			
		}
		System.out.println(order);
		
		
	}

}
