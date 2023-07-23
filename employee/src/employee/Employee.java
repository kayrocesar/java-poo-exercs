package employee;

public class Employee {

	
	private String name;
	private double GrossSalary;
	private double Tax;
	
	
	public Employee() {
	
	}
	
	public Employee(String name, double grossSalary, double tax) {
	
		this.name = name;
		GrossSalary = grossSalary;
		Tax = tax;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrossSalary() {
		return GrossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		GrossSalary = grossSalary;
	}

	public double getTax() {
		return Tax;
	}

	public void setTax(double tax) {
		Tax = tax;
	}
	
    public double NetSalary() {
    	return this.GrossSalary - this.Tax;
    }
    public void IncreaseSalary (double percentage) {
    	this.GrossSalary += this.GrossSalary * percentage/100;
    	System.out.println(this.GrossSalary);
    }

	@Override
	public String toString() {
		return "Employee: " + name + ", $ " + NetSalary() ;
	}
    
    
	
	
	
	
}
