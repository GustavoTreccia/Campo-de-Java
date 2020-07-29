package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entites.Installment;
import entites.Payment;
import services.ContractProcess;
import services.PaypalService;

public class Program {

	public static void main(String[] args) throws ParseException {
		//System.out.println();
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Enter contract data: ");
			
			System.out.println("Contract Number: ");
			int number = sc.nextInt();
			System.out.println("Date of the Contract (dd/MM/yyyy): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.println("Contract Value: ");
			Double totalValue = sc.nextDouble();
			
			Payment pm = new Payment(number, contractDate, totalValue);
			
			System.out.println("Number of installments: ");
			int n = sc.nextInt();
			
			ContractProcess contractProcess = new ContractProcess(new PaypalService());
			
			contractProcess.processContract(pm, n);
			
			System.out.println("Installments: ");
			for(Installment x : pm.getInstallments()) {
				System.out.println(x);
			}
			
			sc.close();
		}
		
	}

