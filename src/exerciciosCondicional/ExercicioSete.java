package exerciciosCondicional;

import java.util.Scanner;

public class ExercicioSete {

	public static void main(String[] args) {
		// ler 2 valores x e y de uma casa decimal que representam coordenadas,e indicar a qual quadrante pertence
	
		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if (x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		}
		else if (x == 0.0) {
			System.out.println("Eixo Y");
		}
		else if (y == 0.0) {
			System.out.println("Eixo X");
		}
		else if (x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		}
		else if (x < 0.0 && y > 0.0) {
			System.out.println("Q2");
		}
		else if (x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		}
		else {
			System.out.println("Q4");
		}
		
		sc.close();

	}

}
