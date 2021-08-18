package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.Calc;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Whats is the dollar price? ");
		Calc.price = sc.nextDouble();
		
		System.out.println("how many dollars will be bought? ");
		Calc.quant = sc.nextDouble();
		
		System.out.printf("amount to be paid in reais = %.2f", Calc.real());
		
		sc.close();
		
	}

}
