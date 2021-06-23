package exerciciosCondicional;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		// ler 2 valores a,b, SÃO MULTIPLOS E NÃO SÃO MULTIPLOS.
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}
		
		sc.close();

	}

}
