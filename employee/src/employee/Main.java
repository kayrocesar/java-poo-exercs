package employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc= new Scanner(System.in);
    	double increase;
		Employee e1 = new Employee("Joao Silva", 6000.00,1000.00);
		System.out.println(e1);
		System.out.println("Which percentage to increase salary?");
		increase=sc.nextDouble();
		e1.IncreaseSalary(increase);
		System.out.println(e1);
		sc.close();
	}
}
