package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {

		String opc, name;
		int hours;
		double valuePerHour, additional;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();

		List<Employee> employees = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.println("Employee #" + i + " data: ");
			System.out.print("Outsourced (y/n)? ");
			opc = sc.nextLine();
			System.out.print("Name: ");
			name = sc.nextLine();
			System.out.print("Hours:");
			hours = sc.nextInt();
			System.out.print("Value per hour:");
			valuePerHour = sc.nextDouble();

			if (opc.equals("y")) {
				System.out.print("Additional charge: ");
				additional = sc.nextDouble();
				Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additional);
				employees.add(emp);
			} else {
				Employee emp = new Employee(name, hours, valuePerHour);
				employees.add(emp);
			}

		}
		System.out.println("PAYMENTS: ");
		for (Employee employee : employees) {
			System.out.println(employee.getName() + " - $ " + employee.payment());
		}
		sc.close();

	}

}
