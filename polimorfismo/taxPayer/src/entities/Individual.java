package entities;

public class Individual extends TaxPayer {
	private double healthExpenditures;

	public Individual( ) {
		super();
	}

	public Individual(String name, double anualIncome, double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		if (super.getAnualIncome() < 20000) {
			return 0.15*super.getAnualIncome() - (healthExpenditures * 0.5);
		}
		else if(super.getAnualIncome() >= 20000) {
			return 0.25*super.getAnualIncome() - (healthExpenditures * 0.5);
		}
		return 0;
	}

}
