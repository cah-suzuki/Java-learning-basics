package exerciciosWhile;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		// repita a leitura ate receber senha valida, escrever senha invalida, correta = 2002
        Scanner sc = new Scanner(System.in);
		
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha Invalida");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		sc.close();
	}

}
 