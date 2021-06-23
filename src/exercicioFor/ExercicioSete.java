package exercicioFor;

import java.util.Scanner;

public class ExercicioSete {

	public static void main(String[] args) {
		// ler n int positivo N , mostrar N linhas de 1 a N, para cada linha mostarr numero da linha e quadrado e cubo do valor
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {

			int primeiro = i;
			int segundo = i * i;
			int terceiro = i * i * i;
			System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
		}
		
		sc.close();
	}

}
