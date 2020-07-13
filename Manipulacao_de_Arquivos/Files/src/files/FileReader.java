package files;

import java.io.File;

import java.util.Scanner;

public class FileReader {

	public static void main(String[] args) {
		//File file = new File("/home/gustavo/in.txt");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o caminho do diretório: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("Diretórios: ");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("Files: ");
		for (File file : files) {
			System.out.println(file);
		}
		
		boolean success = new File(strPath + "/novaPasta").mkdir();
		System.out.println("Diretório criado com sucesso: " + success);
		
		sc.close();

	}

}
