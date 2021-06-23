package exerciciosSequencial;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		// ler 4 valores int, A B C D, calcular DIFERENCA = (A*B-C*D)
       Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, dif;

	    A = sc.nextInt();
	    B = sc.nextInt();
	    C = sc.nextInt();
	    D = sc.nextInt();

	    dif = A * B - C * D;

	    System.out.println("DIFERENCA = " + dif);	
		
		sc.close();

	}

}
