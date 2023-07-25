package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.Workerlevel;

public class Worker {

	private String name;
	private Workerlevel level;
	private double baseSalary;

	private Department department; // composição
	private List<HourContract> contracts = new ArrayList<>(); // nao vai no construtor

	public Worker() {

	}

	public Worker(String name, Workerlevel level, double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Workerlevel getLevel() {
		return level;
	}

	public void setLevel(Workerlevel level) {
		this.level = level;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	public void addContract(HourContract contract) {
		this.contracts.add(contract);
	}

	public void removeContract(HourContract contract) {
		this.contracts.remove(contract);
	}

	public double income(int year, int month) {
		double totalValueContracts = 0.0;
		Calendar calendar = Calendar.getInstance();

		for (HourContract hourContract : contracts) {

			calendar.setTime(hourContract.getDate());
			int h_year = calendar.get(Calendar.YEAR);
			int h_month = 1 + calendar.get(Calendar.MONTH);

			if (h_year == year && h_month == month) {
				totalValueContracts += hourContract.totalValue();
			}

		}
		return baseSalary + totalValueContracts;
	}

}
