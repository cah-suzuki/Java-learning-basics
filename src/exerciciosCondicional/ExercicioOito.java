package exerciciosCondicional;

import java.util.Scanner;

public class ExercicioOito {

	public static void main(String[] args) {
		// ler valor com 2 casa decimais que representa salario e calcular imposto de renda
		//de 0.00 a 2000.00 = isento, de 2000.01 a 3000.00 = 8%, de 3000.01 a 4500.00 = 18%, acima de 4500.00 = 28%
		
		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();
		
		double imposto;
		if (salario <= 2000.0) {
			imposto = 0.0;
		}
		else if (salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.08;
		}
		else if (salario <= 4500.0) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}

		if (imposto == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", imposto);
		}
		
		sc.close();
		
	}

}
