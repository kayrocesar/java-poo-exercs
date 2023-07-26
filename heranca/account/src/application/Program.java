package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;



public class Program {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		
		
		/*
		//UPCASTING (SUPERCLASSE = NEW CLASSE FILHO)
		
		Account acc1 = bacc;
		Account acc2= new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3= new SavingsAccount(1004, "Stela", 0.0, 0.01);
		
		// DOWNCASTING (NEW CLASSE FILHO = SUPERCLASSE)
		
	    BusinessAccount acc4 = (BusinessAccount) acc2;
	    acc4.loan(100);
		
	    
	    // BusinessAccount acc5 = (BusinessAccount) acc3;
	    if( acc3 instanceof BusinessAccount) {
	    	BusinessAccount acc5 = (BusinessAccount)acc3;
	    	acc5.loan(200.0);
	    	System.out.println("Loan");
	    }
	    if(acc3 instanceof SavingsAccount) {
	    	SavingsAccount acc5= (SavingsAccount)acc3;
	    	acc5.updateBalance();
	    	System.out.println("Update");
	    }
	    */
		Account a =new Account(1001, "Alex", 500);
		Account b =new SavingsAccount(1002, "Ana", 500,0.01);
		Account c =new BusinessAccount(1003, "Artur", 500,200);
		
		a.withdraw(50);
		b.withdraw(50);
		c.withdraw(50);
		
		System.out.println(a.getBalance());
		System.out.println(b.getBalance());
		System.out.println(c.getBalance());
	

	}

}
