package exerciciosSequencial;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		// Ler 2 valores inteiros, mostrar soma deles com msg explicativa
		
		Scanner sc = new Scanner (System.in);

		int x;
		int y;
	    int soma;
		
		x= sc.nextInt();
		y=sc.nextInt();
	    soma = x+y;
		
		System.out.print("SOMA =  ");
		System.out.println(soma);

        sc.close();

	}

}
