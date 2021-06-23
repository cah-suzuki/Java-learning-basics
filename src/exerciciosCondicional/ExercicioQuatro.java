package exerciciosCondicional;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		// Hora final e inicial de um jogo
		Scanner sc = new Scanner(System.in);

		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		
		int duracao;
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		sc.close();
	}

}
