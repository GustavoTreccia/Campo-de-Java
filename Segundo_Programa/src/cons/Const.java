package cons;
import java.util.Scanner;
public class Const {
	public static void main(String[] args) {
		final double Pi = 3.14; //Constantes s�o n�meros que n�o podem ser modificadas por nada.
		System.out.println("Feito por GTreccia.");
		System.out.println("ATEN��O: PROGRAMA SUJEITO A MUDAN�AS.");
		System.out.println("Insira 1 para medir uma circunfer�ncia;");
		System.out.println("Insira 2 para medir uma �rea [para retangulos];");
		System.out.println("Insira 3 para medir um perimetro [para retangulos];");
		System.out.print("Opcao: ");
		Scanner in = new Scanner ( System.in );
		int dec = in.nextInt();
		double num1, num2, num3, num4, num;
		System.out.println("|------"+ dec+ "------|");
			// Perimetro: Soma de todos os lados | Area: Lado vezes lado | Circunferencia (duas vezes pi)vezes raio
	
		if(dec == 1) {
			System.out.println("|Medidor de circunfer�ncias|");
			
			System.out.print("Insira o raio da circunfer�ncia a ser medida: ");
			
			num1 = in.nextDouble();
			
			num = (2 * Pi) * num1;
			
			System.out.println("O comprimento � de: "+ num);
			
		}else { if(dec == 2) {
			System.out.println("|Medidor de �rea|");
			
			
			System.out.print("Insira a primeira medida: ");
			
			num1 = in.nextDouble();
			
			System.out.print("Insira a segunda medida: ");
			
			num2 = in.nextDouble();
			
			num = num1 * num2;
			
			System.out.println("A area total � de: "+ num);
		}else { if(dec == 3) {
			System.out.println("|Medidor de perimetro|");
			
			
			System.out.print("Insira a primeira medida: ");
			
			num1 = in.nextDouble();
			
			System.out.print("Insira a segunda medida: ");
			
			num2 = in.nextDouble();
			
			System.out.print("Insira a terceira medida: ");
			
			num3 = in.nextDouble();
			
			System.out.print("Insira a quarta medida: ");
			
			num4 = in.nextDouble();
			
			num = num1 + num2 + num3 + num4;
			
			System.out.println("O perimetro total � de: "+ num);
		}
		
		
		}
	}

}
}
