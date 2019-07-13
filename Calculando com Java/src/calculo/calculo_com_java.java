package calculo;
import java.util.Scanner; //Importa a função de Scanner
public class calculo_com_java {
	public static void main(String[] args) {
		Scanner in = new Scanner( System.in ); //Cuidado ao colocar o Scanner, ele não é igual ao Scanf do C, você só coloca um Scanner e o resto utilize "NextInt" como visto ali embaixo.
		double num1, num2, soma, sub, mult, div; //lembrando que Int para inteiros e double para numeros quebrados. 
		System.out.println("Olá, bem vindo ao sistema calculativo.");
		System.out.println("Insira um numero: ");
		num1 = in.nextDouble(); //Lembrando que existe várias in.next (in.next Int ou Double ou Char ou Boolean)
		System.out.println("Insira outro numero: ");
		num2 = in.nextDouble();
		
		soma = num1 + num2; //A soma
		System.out.println("A soma dos dois numeros foi de: "+ soma);
		
		sub = num1 - num2; //A subtração
		System.out.println("A subtracao dos dois numeros foi de: "+ sub);
		
		mult = num1 * num2; //A multiplicação
		System.out.println("A multiplicacao dos dois numeros foi de: "+ mult);
		
		div = num1 / num2; //A divisão
		System.out.println("A divisão dos dois numeros foi de: "+ div);
	}
}
