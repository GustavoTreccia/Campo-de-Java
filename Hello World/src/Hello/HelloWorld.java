package Hello;
import java.util.Scanner; //PRESTE A ATENÇÃO NISTO
// import java.net.*; <- Importa todas as classes do pacote .NET
// import java.net.URL; <- Importa a classe URL do pacote .NET
// Em prol: local.pacote.classe;
public class HelloWorld{
	public static void main(String[] args) {
		int num1;
		num1 = 100;
		String f = "string";
		System.out.println("Hello World!");
		System.out.println( num1 );
		System.out.println("Temos no num1: "+ num1);
		System.out.println( f );
		
		System.out.print("Digite um numero: ");//1   E NESTES TRÊS
		Scanner in = new Scanner( System.in ); //2
		System.out.print( in.nextLine() );//3
	}
}