package util;

public class Calculator {

	public static final double PI = 3.14159;
	
	public static double circunferencia(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
	
	public static double precoASerPago(double dolar, double qtd) {
		return (0.06 * dolar * qtd) + (dolar * qtd);
	}
}
