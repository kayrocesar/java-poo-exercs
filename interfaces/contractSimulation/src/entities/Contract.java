package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
	SimpleDateFormat sp = new SimpleDateFormat("dd/MM/yyyy");
	private int number;
	private Date date;
	private double totalValue; 
	
	private List<Installment> installments=  new ArrayList<>();

	public Contract(int number, Date date, double totalValue) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}

	public List<Installment> getInstallments() {
		return installments;
	}

	public void addInstallment(Installment installment) {
		installments.add(installment);
	}
	
	public void removeInstallment(Installment installment) {
		installments.remove(installment);
	}

	@Override
	public String toString() {
		return "Contract [number: " + number + ", date: " + sp.format(date) + ", totalValue: " + totalValue + ", installments: \n"
				+ installments + "]";
	}
	
	
	
	
	
	
	
}
