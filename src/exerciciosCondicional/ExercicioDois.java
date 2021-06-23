package exerciciosCondicional;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		// par ou impar
		
		
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
	    
		if (N % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}

		sc.close();
	
		

	}

}
