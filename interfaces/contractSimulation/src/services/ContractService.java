package services;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

import entities.Contract;
import entities.Installment;

public class ContractService {
	
	private OnlinePaymentService onlinePaymentService;
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, int months) throws ParseException {
		
        double amount= contract.getTotalValue()/months;
        Date date = contract.getDate();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        
		for (int i = 1; i <= months; i++) {
			
			
			calendar.add(Calendar.MONTH, 1);
			
			
			double interest=onlinePaymentService.interest(amount,i);
			double fee = onlinePaymentService.paymentFee(amount+interest);
			double total= amount + interest + fee;
			
			
			Installment installment = new Installment(calendar.getTime(), total);
			contract.addInstallment(installment);
			
			calendar.setTime(calendar.getTime());

		}

	}

}
