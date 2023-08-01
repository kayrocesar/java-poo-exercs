package services;

public class PaypalService implements OnlinePaymentService {

	public double paymentFee(double amount) {
		return amount * 0.02; // taxa de pagamento fixa de 2%
	}
	public double interest(double amount,int months) {

	    return   amount *  0.01 * months; // juros simples de 1% ao mes
	}
}
