package estruturaSequencial;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		System.out.println("Olá, Mundo!");
		
		int y=32;
		System.out.println(y);

		double x = 10.35785;
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO = %.2f METROS%n", x);
		
		String nome = "Maria";
		int idade = 31;
		double renda = 400.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
		
	}

}

