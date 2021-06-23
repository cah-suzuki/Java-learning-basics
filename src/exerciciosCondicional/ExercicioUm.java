package exerciciosCondicional;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		// negativo ou positivo
		Scanner sc = new Scanner (System.in);

		int inteiro;
	
		inteiro= sc.nextInt();
		
		if (inteiro<0) {
			System.out.println("NEGATIVO");
			
		} else {
			System.out.println("NÃO NEGATIVO");
		}
	   sc.close();
	}

}
