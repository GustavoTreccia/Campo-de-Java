package teste;
import java.util.Scanner;

public class ghost {
	public static void main(String[] args) {
		System.out.print("Insira a idade do seu cachorro: ");
		
		Scanner in = new Scanner ( System.in);
		int idade = in.nextInt(); //PRESTE A ATENÇÃO NESTE
		idade = idade * 7;
		
		System.out.println("A idade do seu dog e de: "+idade+" anos.");
	}

}
