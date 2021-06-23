package exercicioFor;

import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {
		// Ler valor N calcular e escrever seu fatorial,se zero=1
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int fat = 1;
		for (int i=1; i<=n; i++) {
			fat = fat * i;
		}
		
		System.out.println(fat);
		
		sc.close();
	}

}
