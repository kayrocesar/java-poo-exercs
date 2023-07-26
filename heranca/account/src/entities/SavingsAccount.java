package entities;
// final nao deixa herdar a classe
public final class SavingsAccount extends Account {

	private double interestRate;

	public SavingsAccount() {
		super();

	}

	public SavingsAccount(int number, String holder, double balance, double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	@Override  
	public final void withdraw(double amount) { // final nao deixa herdar o método
		balance -= amount;
	}

	
	
	
}
