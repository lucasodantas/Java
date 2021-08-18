package entities;

public class Retangulo {
	
	public double Altura;
	public double Largura;

	
	public double area() {
		return Altura * Largura;
	}
	
	public double perimetro() {
		return (Altura + Largura) * 2;
	}
	
	public double diagonal() {
		double res = (Altura * Altura) + (Largura * Largura);
		return Math.sqrt(res);
	}
}
