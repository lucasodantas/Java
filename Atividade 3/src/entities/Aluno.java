package entities;

public class Aluno {
	
	public String nome;
	public double t1;
	public double t2;
	public double t3;
	
	public double nota() {
		return t1 + t2 + t3;
	}
	
	public double faltou() {
		double x = t1 + t2 + t3;
		return x - 60.00;
	}
	
}
