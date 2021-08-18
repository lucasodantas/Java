package entities;

public class Employee {
	
	public String Nome;
	public double salarioBruto;
	public double tax;
	public int prc;
	
	public double salarioLiquido() {
		return salarioBruto -  tax;
	}
	
	public double aumento() {
		double x = (prc * salarioBruto)/100;
		return x + salarioBruto - tax;
	}
}
