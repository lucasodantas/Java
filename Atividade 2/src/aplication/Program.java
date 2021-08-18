package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee x;
		x = new Employee();
		
		
		System.out.println("Dados do funcionario");
		System.out.printf("Nome:");
		x.Nome = sc.nextLine();
		System.out.printf("Salário bruto:");
		x.salarioBruto = sc.nextDouble();
		System.out.printf("Taxas:");
		x.tax = sc.nextDouble();
		
		System.out.println("Funcionario: " + x.Nome + ", $ " + x.salarioLiquido());
		
		System.out.println("Qual a porcentagem do aumento do funcionario?");
		x.prc = sc.nextInt();
		
		System.out.println("Dados atualizados: " + x.Nome + ", $ " + x.aumento());
		sc.close();
	}

}
