package calculo;
import java.util.Scanner; //Importa a fun��o de Scanner
public class calculo_com_java {
	public static void main(String[] args) {
		Scanner in = new Scanner( System.in ); //Cuidado ao colocar o Scanner, ele n�o � igual ao Scanf do C, voc� s� coloca um Scanner e o resto utilize "NextInt" como visto ali embaixo.
		double num1, num2, soma, sub, mult, div; //lembrando que Int para inteiros e double para numeros quebrados. 
		System.out.println("Ol�, bem vindo ao sistema calculativo.");
		System.out.println("Insira um numero: ");
		num1 = in.nextDouble(); //Lembrando que existe v�rias in.next (in.next Int ou Double ou Char ou Boolean)
		System.out.println("Insira outro numero: ");
		num2 = in.nextDouble();
		
		soma = num1 + num2; //A soma
		System.out.println("A soma dos dois numeros foi de: "+ soma);
		
		sub = num1 - num2; //A subtra��o
		System.out.println("A subtracao dos dois numeros foi de: "+ sub);
		
		mult = num1 * num2; //A multiplica��o
		System.out.println("A multiplicacao dos dois numeros foi de: "+ mult);
		
		div = num1 / num2; //A divis�o
		System.out.println("A divis�o dos dois numeros foi de: "+ div);
	}
}
