package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno x;
		x = new Aluno();
		
		System.out.println("Digite o nome do aluno: ");
		x.nome = sc.nextLine();
		System.out.println("Digite a nota do 1° trimestre");
		x.t1 = sc.nextDouble();
		while (x.t1 > 30) {
			System.out.println("Sua nota está maior de 30, digite novamente:");
			x.t1 = sc.nextDouble();
		}
		
		System.out.println("Digite a nota do 2° trimestre");
		x.t2 = sc.nextDouble();
		while (x.t2 > 35) {
			System.out.println("Sua nota está maior de 30, digite novamente:");
			x.t2 = sc.nextDouble();
		}
		
		System.out.println("Digite a nota do 3° trimestre");
		x.t3 = sc.nextDouble();
		while (x.t3 > 35) {
			System.out.println("Sua nota está maior de 30, digite novamente:");
			x.t3 = sc.nextDouble();
		}
		
		System.out.printf("Nota final: %.2f%n", x.nota());
		if (x.nota() > 60.00) {
			System.out.println("Você Passou! ");
		}
		
		else {
			System.out.println("Você não passou :/ ");
			System.out.printf("Faltaram %.2f", x.faltou(), " Pontos");
		}
		sc.close();
	}

}
