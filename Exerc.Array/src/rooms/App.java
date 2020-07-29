package rooms;

import java.util.Locale;
import java.util.Scanner;

import informations.Info;

public class App {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Digite quantos quartos serão alugados: ");
		int n = sc.nextInt();
		Info[] infos = new Info[10];
		
		for(int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Quarto #" + i + ": ");
			System.out.println("Nome: ");
			sc.nextLine();
			String name = sc.next();
			System.out.println("Email: ");
			String email = sc.next();
			System.out.println("Quarto: ");
			int room = sc.nextInt();
			infos[room] = new Info(name, email);
			
			//infos[i] = new Info(name, email); 
		}
		
		System.out.println();
		System.out.println("Quartos já alugados: ");
		
		for(int i=0; i<9; i++) {
			
			if (infos[i] != null) {
				System.out.println(i + ": " + infos[i]);
			}
			
		}
		
		sc.close();
		
	}

}
