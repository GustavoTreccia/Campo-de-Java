package visual;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import info.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		
		System.out.println("Quantos empregados serão registrados? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println(" ");
			System.out.println("Empregado #" + i + " :");
			System.out.println("Digite o ID: ");
			int ID = sc.nextInt();
			while (hasID(list, ID)) {
				System.out.println("ID já utilizado, insira outro");
				ID = sc.nextInt();
			}
			System.out.println("Digite o nome: ");
			String name = sc.next();
			System.out.println("Digite o salário: ");
			Double salary = sc.nextDouble();
			
			list.add(new Employee(ID, name, salary));
		}
		
		System.out.println("-----------------------------");
		System.out.println(" ");
		System.out.println("Digite o ID do funcionário que irá receber o aumento");
		int ID = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getID() == ID).findFirst().orElse(null);
		if (emp == null ) {
			System.out.println("Este ID não existe.");
		} else {
			System.out.println("Digite a porcentagem de aumento");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		System.out.println("-----------------------------");
		System.out.println(" ");
		System.out.println("Todos os funcionários já cadastrados: ");
		for (Employee obj : list) {
			System.out.println("ID: " + obj.getID() + " | Nome: " + obj.getName() + " | Salário: " + obj.getSalary());
		}
		
		
		sc.close();
	}
	
	public static boolean hasID (List<Employee> list, int ID) {
		Employee emp = list.stream().filter(x -> x.getID() == ID).findFirst().orElse(null);
		return emp != null;
		
	}

}
