package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.Workerlevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter department's name: ");
		String depName= sc.nextLine();
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String workerName= sc.nextLine();
		System.out.print("Level: ");
		String workerLevel= sc.nextLine();
		System.out.print("Base salary: ");
		double baseSalary= sc.nextDouble();
		Department department = new Department(depName);
		Worker worker= new Worker(workerName,Workerlevel.valueOf(workerLevel),baseSalary,department);
		System.out.print("How many contracts to this worker? ");
		int numberContracts=sc.nextInt();
		for (int i = 1; i <= numberContracts; i++) {
			sc.nextLine();
			System.out.println("Enter contract #" +i + " data: ");
			System.out.print("Date (DD/MM/YYYY): ");
			String d = sc.nextLine();
		    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		    Date date = dateFormat.parse(d);
		    System.out.print("Value per hour: ");
		    double valuePerHour = sc.nextDouble();
		    System.out.print("Duration (hours): ");
		    int duration = sc.nextInt();
		    HourContract hourContract= new HourContract(date, valuePerHour,duration);
		    worker.addContract(hourContract);
		    
		}
		sc.nextLine();
	    System.out.print("Enter month and year to calculate income (MM/YYYY): ");
	    String dateIncome = sc.nextLine();
	    int month= Integer.parseInt(dateIncome.substring(0,2));
	    int year= Integer.parseInt(dateIncome.substring(3,7));
	    System.out.println("Name: "+ worker.getName() + "\nDepartment: " 
	                 + worker.getDepartment().getName() + "\nIncome for "
	    		   + dateIncome + ":" + worker.income(year, month));
	    
	    
	    
	    
	
		
		
		
        sc.close();
	}

}
