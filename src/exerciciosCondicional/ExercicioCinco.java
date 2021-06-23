package exerciciosCondicional;

import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {
		// leia codigo e quantidade de item, e calcule e mostre valor de conta a pagar
		Scanner sc = new Scanner(System.in);

		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		
		double total;
		if (codigo == 1) {
			total = quantidade * 4.0;
		}
		else if (codigo == 2) {
			total = quantidade * 4.5;
		}
		else if (codigo == 3) {
			total = quantidade * 5.0;
		}
		else if (codigo == 4) {
			total = quantidade * 2.0;
		}
		else {
			total = quantidade * 1.5;
		}

		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();
		
		

	}

}
