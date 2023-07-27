package entities;

public class Company extends TaxPayer {
	private int numberOfEmployees;

	public Company() {
		super();
		
	}

	public Company(String name, double anualIncome, int numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double tax() {
		if (numberOfEmployees > 10) {
			return 0.14 * super.getAnualIncome();
		} else {
			return 0.16 * super.getAnualIncome();

		}
	}

}
