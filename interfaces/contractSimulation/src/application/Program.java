package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import entities.Contract;
import services.ContractService;
import services.PaypalService;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sp = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com os dados do contrato: ");
		System.out.print("Numero: ");
		int numberContract = sc.nextInt();
		sc.nextLine();
		System.out.print("Data (dd/MM/yyyy): ");
		Date date = sp.parse(sc.nextLine());
		System.out.print("Valor do contrato: ");
		double valueContract = sc.nextDouble();
		System.out.print("Entre com o número de parcelas: ");
		int numberInstallments = sc.nextInt();

		Contract contract = new Contract(numberContract, date, valueContract);

		ContractService service = new ContractService(new PaypalService());
		service.processContract(contract, numberInstallments);

		System.out.println(contract);
		sc.close();
	}

}
