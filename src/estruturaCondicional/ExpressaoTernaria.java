package estruturaCondicional;

public class ExpressaoTernaria {

	public static void main(String[] args) {
		// opcional ao if else , decidir valor com base em condicao (condicao) ? valorSeVerdadeiro : valorSeFalso
		
//		double preco = 34.5;
//		double desconto;
//		if (preco < 20.0) {
//		desconto = preco * 0.1;
//		}
//		else {
//		desconto = preco * 0.05;
//		}

		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		System.out.println(desconto);
		
	}

}
