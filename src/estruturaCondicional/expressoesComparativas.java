package estruturaCondicional;

import java.util.Scanner;

public class expressoesComparativas {

	public static void main(String[] args) {
		// expressão => valor verdade
		// condicional => verdadeira executa um bloco => falsa executa outro bloco, simples if ou composta if, else
		//exemplo hora do dia
		
		Scanner sc = new Scanner (System.in);
		int hora;
		
		System.out.println("Quantas Horas ?");
		hora = sc.nextInt();
		
		if (hora < 12) {
			System.out.println("Bom Dia!");
		} else if (hora < 18) {
			System.out.println("Boa Tarde");
		}else {
			System.out.println("Boa Noite!");
		}
	sc.close();
	}  
	

}
