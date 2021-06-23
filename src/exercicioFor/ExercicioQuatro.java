package exercicioFor;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		// Ler n N.N pares de numeros e mostre divisao do primeiro pelo segundo,se zero mostrar divisão impossivel
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if (y == 0) {
				System.out.println("divisao impossivel");
			}
			else {
				double div = (double) x / y;
				System.out.printf("%.1f%n", div);
			}
		}
		
		sc.close();

	}

}
