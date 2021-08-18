package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.User;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		User user;
		
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter account holder: ");
		String name = sc.nextLine(); 
		
		System.out.println("Is there an initial deposit (y/n)?");
		char res = sc.next().charAt(0);
		
		if (res == 'y'  || res == 'Y') {
			System.out.println("Value: ");
			double initialDeposit = sc.nextDouble();
			user = new User(name, number, initialDeposit); 
		}
		
		else {
			user = new User(name, number);
		}
		
		System.out.println("Account data:");
		System.out.println(user);
		
		System.out.println("Enter a deposit value: ");
		user.deposit(sc.nextDouble());
		
		System.out.println("updated account data:");
		System.out.println(user);
		
		System.out.println("enter a withdraw value: ");
		user.saque(sc.nextDouble());
		
		System.out.println("updated account data:");
		System.out.println(user);
		sc.close();
	}

}
