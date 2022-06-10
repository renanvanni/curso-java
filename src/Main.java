import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	 	Scanner sc = new Scanner(System.in);

		Locale.setDefault(Locale.US);
		
//		int min = sc.nextInt();
//		
//		double conta = 50.0;
//		if(min > 100) {
//			conta += (min - 100) * 2.0;
//		}
//		
//		System.out.printf("Valor da conta = R$ %.2f%n", conta);
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b, c);
		
		showResult(higher);

		sc.close();
	}
	
	public static int max(int a, int b, int c) {
		int aux;
		if(a > b && a > c) {
			aux = a;
		} else if(b > c) {
			aux = b;
		} else {
			aux = c;
		}
		return aux;
	}
	
	public static void showResult(int show) {
		System.out.println("Higher = " + show);
	}

}
