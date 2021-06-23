package estruturaSequencial;
import java.util.Scanner;

public class entradaDados2 {

	public static void main(String[] args) {
		// Ler palavra digitada do teclado
//		Scanner sc = new Scanner (System.in);
//		String x;
//		int y;
//		double z;
//		
//		x= sc.next();
//		y=sc.nextInt();
//		z=sc.nextDouble();
//		
//		System.out.println("Voce Digitou: ");
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(z);
//		
//		sc.close();
		
		//Ler número inteiro sc.nextInt();
		//Ler double x= sc.nestDouble();
		//Ler caractere x=sc.next().charAt(0);
		
	    //Ler texto até quebra de Linha
		Scanner sc = new Scanner(System.in);
		String s1,s2,s3;
		
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados Digitados: ");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
		
		// quebra de linha pendente, x= sc.nextInt logo antes do nextLine
		

	}

}
