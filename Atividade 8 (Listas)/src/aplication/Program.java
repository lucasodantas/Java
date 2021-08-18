package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employees;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many employees will be registered? ");
		int N = sc.nextInt();
		
		List<Employees> list = new ArrayList<>();
		
		for (int i=0; i<N; i++) {
			
			System.out.println();
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("ID:");
			Integer id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.println("id already taken");
				id = sc.nextInt();
			}
			
			System.out.print("Name:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary:");
			Double salary = sc.nextDouble();
			
			Employees emp = new Employees(id, name, salary);			
			
			list.add(emp);
		}
		
		System.out.println("Enter the employee id that will have salary increase : ");
		int empId = sc.nextInt();
		Integer pos = position(list, empId);
		
		
		if (pos == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();
			list.get(pos).increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for (Employees emp : list) {
			System.out.println(emp);
		}
		
		sc.close();
	}
	
	
	//função auxiliar para procurar a posição de um id na lista
	
	public static Integer position (List<Employees> list, int id) {
		for  (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id); {
				return i;
			}
		}
		return null;
	}
	
	//função hasId auxiliar para identificar se o id existe utilizando while (hasId(list, id))
	
	public static boolean hasId(List<Employees> list, int id) {
		Employees emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	
	}
		
}
