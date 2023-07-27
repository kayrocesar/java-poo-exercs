package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat simpleDate = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> products = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String name, opc, date;
		double price, customsFee;
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.println("Product #" + i + " data: ");
			System.out.print("Common, used or imported (c/u/i)? ");
			opc = sc.nextLine();
			System.out.print("Name: ");
			name = sc.nextLine();
			System.out.print("Price: ");
			price = sc.nextDouble();

			if (opc.equals("c")) {
				Product p = new Product(name, price);
				products.add(p);
			} else if (opc.equals("u")) {
				sc.nextLine();
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				date = sc.nextLine();
				Product p = new UsedProduct(name, price, simpleDate.parse(date));
				products.add(p);
			} else {
				System.out.print("Customs fee: ");
				customsFee = sc.nextDouble();
				Product p = new ImportedProduct(name, price, customsFee);
				products.add(p);
			}
		}
		System.out.println("PRICE TAGS: ");
		for (Product product : products) {
			System.out.println(product.priceTag());
		}
		sc.close();

	}

}
