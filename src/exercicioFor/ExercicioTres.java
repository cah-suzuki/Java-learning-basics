package exercicioFor;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		// ler valor int N,representa n de casos de teste = 3 valores reais com uma casa decimal.media ponderada de cada conjunto com peso 2,3 e 5
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();

			double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

			System.out.printf("%.1f%n", media);
		}
		
		sc.close();
	}

}
