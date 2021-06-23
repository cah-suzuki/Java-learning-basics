package exerciciosWhile;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		// ler coordenadas x,y de uma quant de pontos do sistema cartesiano,escrever o quadrante que ele pertence,programa encerrado se pelo menos uma coordenada for nula
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			}
			else if (x < 0 && y > 0) {
				System.out.println("segundo");
			}
			else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			}
			else {
				System.out.println("quarto");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();

	}

}
