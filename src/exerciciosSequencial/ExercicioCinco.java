package exerciciosSequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {
		// ler codigo peça 1 numero de peças 1 e valor unitario de peças 1, msm com peças 2 , e calcular valor a ser pago
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int qte1, qte2;
	    double preco1, preco2, total;

	
	    qte1 = sc.nextInt();
	    preco1 = sc.nextDouble();
	    
	    qte2 = sc.nextInt();
	    preco2 = sc.nextDouble();

	    total = preco1 * qte1 + preco2 * qte2;

	    System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		sc.close();

	}

}
