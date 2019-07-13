package calculo;
import java.util.Scanner;
public class Calculadora {
	public static void main(String[] args) {
		System.out.println("Feito por GTreccia.");
		System.out.println("ATENÇÃO: PROGRAMA INSTÁVEL, SIGA CORRETAMENTE O QUE SE PEDE.");
		System.out.println("Qualquer coisa diferente o programa se encerra.");
		System.out.println("Calculadora Java");
		System.out.println("Insira 1 para somar, 2 para subtrair, 3 para multiplicar e 4 para dividir.");
		System.out.print("Opcao: ");
		Scanner in = new Scanner ( System.in );
		int dec = in.nextInt();
		double num1, num2, num3;
		System.out.println("|------"+ dec+ "------|");
			
	
		if(dec == 1) {
			System.out.println("Insira o primeiro numero: ");
			num1 = in.nextDouble();
			System.out.println("Insira o segundo numero: ");
			num2 = in.nextDouble();
			
			num3 = num1 + num2;
			
			System.out.println("O resultado e: "+ num3);
			
			
		}
		if(dec == 2) {
			System.out.println("Insira o primeiro numero: ");
			num1 = in.nextDouble();
			System.out.println("Insira o segundo numero: ");
			num2 = in.nextDouble();
			
			num3 = num1 - num2;
			
			System.out.println("O resultado e: "+ num3);
			
		}
		if(dec == 3) {
			System.out.println("Insira o primeiro numero: ");
			num1 = in.nextDouble();
			System.out.println("Insira o segundo numero: ");
			num2 = in.nextDouble();
			
			num3 = num1 * num2;
			
			System.out.println("O resultado e: "+ num3);
	
	
		}
		if(dec == 4) {
			System.out.println("Insira o primeiro numero: ");
			num1 = in.nextDouble();
			System.out.println("Insira o segundo numero: ");
			num2 = in.nextDouble();
			
			num3 = num1 / num2;
			
			System.out.println("O resultado e: "+ num3);
	
	
		}
		
	}
		
	
}

