package estruturaRepetitiva;
import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		//Enquanto NÃO se sabe a quantidade previamente  V = executa e volta   F= pula fora
		
				Scanner sc = new Scanner (System.in);
				int x = sc.nextInt();
				int soma = 0;
				
				while (x !=0) {
					soma += x;
					x= sc.nextInt();
				}
				System.out.println(soma);
				sc.close();	

	}

}
