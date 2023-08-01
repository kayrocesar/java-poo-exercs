package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {
	SimpleDateFormat sp = new SimpleDateFormat("dd/MM/yyyy");
	private Date dueDate;
	private double amount;

	public Installment() {

	}

	public Installment(Date dueDate, double amount) {

		this.dueDate = dueDate;
		this.amount = amount;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "\nInstallment - dueDate:" + sp.format(dueDate) + String.format(", amount: %.2f", amount);
	}
	
	
	
	

}
