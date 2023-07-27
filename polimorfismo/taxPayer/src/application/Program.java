package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		List<TaxPayer> taxpayers = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #"+i+ " data: ");
			sc.nextLine();
			System.out.println("Individual or company (i/c)? ");
			String opc = sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double income = sc.nextDouble();

			if (opc.equals("i")) {
				System.out.print("Health expenditures: ");
				double healthExp = sc.nextDouble();
				taxpayers.add(new Individual(name, income, healthExp));
			} else {
				System.out.print("Number of employees: ");
				int numEmp = sc.nextInt();
				taxpayers.add(new Company(name,income, numEmp));
			}

		}
		System.out.println("TAXES PAID: ");
		double sum=0.0;
		for (TaxPayer taxPayer : taxpayers) {
			System.out.println(taxPayer.getName()+ ": $" +taxPayer.tax());
			sum+= taxPayer.tax();
		}
		System.out.println("TOTAL TAXES: $ "+sum);

	}

}
