package util;

public class Calc {
	
	public static double price;
	
	public static double quant;
	
	public static double real () {
		double x = quant * price;
		double tax = x * 6 / 100;
		return x + tax;
	}
	
}
