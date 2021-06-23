package exercicioFor;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		//ler valor inteiro N.que representa quant de valores que serao lidos em seguida.mostre quantos estao no intervalo [10,20] "in" e quantos esto fora "out"
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int in = 0;
		int out = 0;
		
		for (int i=0; i<n; i++) {
			int x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in = in + 1;
			}
			else {
				out = out + 1;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();
	}

}
