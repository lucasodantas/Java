package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo x;
		x = new Retangulo();
		
		System.out.println("Digite a altura e largura do retangulo:");
		x.Altura = sc.nextDouble();
		x.Largura = sc.nextDouble();
		
		double area = x.area();
		double perimetro = x.perimetro();
		double diagonal = x.diagonal();
		
		System.out.printf("Area = %.2f%n", area);
		System.out.printf("perimetro = %.2f%n", perimetro);
		System.out.printf("diagonal = %.2f%n", diagonal);
		
		sc.close();
	}

}
