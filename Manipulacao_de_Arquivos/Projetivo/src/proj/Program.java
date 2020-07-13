package proj;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o caminho do arquivo: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("Nome: " + path.getName());
		System.out.println("Caminho: " + path.getPath());
		System.out.println("Diretório: " + path.getParent());
		System.out.println("Espaço disponível: " + path.getFreeSpace());
		
		sc.close();

	}

}
