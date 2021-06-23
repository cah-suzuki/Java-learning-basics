package exerciciosCondicional;

import java.util.Scanner;

public class EexrcicioSeis {

	public static void main(String[] args) {
		// receba valor qualquer e classifique de acordo com intervalo.([0,25],[25,50],[50,75],[75,100])
		Scanner sc = new Scanner(System.in);

		double numero = sc.nextDouble();
		
		if (numero < 0.0 || numero > 100.0) {
			System.out.println("Fora de intervalo");
		}
		else if (numero <= 25.0) {
			System.out.println("Intervalo [0,25]");
		}
		else if (numero <= 50.0) {
			System.out.println("Intervalo (25,50]");
		}
		else if (numero <= 75.0) {
			System.out.println("Intervalo (50,75]");
		}		
		else {
			System.out.println("Intervalo (75,100]");
		}
		
		sc.close();

	}

}
