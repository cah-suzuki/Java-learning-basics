package exerciciosSequencial;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		// ler numero funcionario, numero horas trab, valor que recebe por hora, e calcule salario, mostrar salario com 2 casas dec.
		Scanner sc = new Scanner(System.in);
		double horas,salario,horaTrab;
		int numeroFunc;
		        numeroFunc=sc.nextInt();
		        horas=sc.nextDouble();
		        horaTrab=sc.nextDouble();
				salario=horas*horaTrab;
				
				
				System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n",numeroFunc,salario);
				
		
		
		
        sc.close();
	}

}
