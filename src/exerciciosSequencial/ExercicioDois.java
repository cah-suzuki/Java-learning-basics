package exerciciosSequencial;

import java.util.Scanner;

public class ExercicioDois {
	
	

	public static void main(String[] args) {
		// ler raio do circulo, mostrar valor da area com 4 casas decimais.
		Scanner sc = new Scanner(System.in);
				
		double area, raio , pi;
		
		pi = 3.14159;
		raio=sc.nextDouble();
		area = pi*raio*raio;
		System.out.printf("A=%.4f%n",area);
		
		
		sc.close();
	
	}

	
	
	

}
