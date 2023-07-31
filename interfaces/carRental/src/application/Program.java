package application;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;


public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtft= DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo do carro: ");
		String modelCar=sc.nextLine();
		System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
		LocalDateTime start= LocalDateTime.parse(sc.nextLine(),dtft);
		System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
		LocalDateTime finish= LocalDateTime.parse(sc.nextLine(),dtft);
		
		
		
		CarRental carRental = new CarRental(start, finish, new Vehicle(modelCar));
		
		
		System.out.print("Entre com o preço por hora: ");
		double pricePerHour=sc.nextDouble();
		System.out.print("Entre com o preço por dia: ");
		double pricePerDay=sc.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
		rentalService.processInvoice(carRental);
		
		System.out.println("FATURA: ");
		System.out.println("Pagamento basico: " + carRental.getInvoice().getBasicPayment());
		System.out.println("Imposto: " + carRental.getInvoice().getTax());
		System.out.println("Pagamento total: " + carRental.getInvoice().getTotalPayment());
	}

}
