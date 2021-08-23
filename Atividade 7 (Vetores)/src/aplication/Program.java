package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Rooms;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many rooms will be rented?");
		int n = sc.nextInt();
		
		Rooms[] vect = new Rooms[n];
		
		for (int i=0; i<vect.length; i++) {
			int rent = i + 1;
			System.out.println("Rent #" + rent);
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.next();
			System.out.println("Room:");
			int room =sc.nextInt();
			if (vect[room] == null) {
				vect[room] = new Rooms(name, email);
			}
			else {
				System.out.println("Occupied!");
				
			}
		}
		
		for (int i=0; i<n; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
			
		}
		sc.close();
		
	}

}
