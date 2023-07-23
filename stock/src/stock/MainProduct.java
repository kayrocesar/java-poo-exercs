package stock;

import java.util.Scanner;

public class MainProduct {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		Product p = new Product("TV",900.00, 10);
		System.out.println(p);
		System.out.println("Enter the number of products to be added in stock: ");
		int t= sc.nextInt();
		p.AddProducts(t);
		System.out.println(p);
		System.out.println("Enter the number of products to be removed from stock: ");
		t= sc.nextInt();
		p.RemoveProducts(t);
		System.out.println(p);

		
		sc.close();
	}

}
