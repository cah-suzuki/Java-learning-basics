package estruturaSequencial;

public class processamentoDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		double y;
		x=5;
		y=2*x;
		
		System.out.println(x);
		System.out.println(y);
		
		//Área do trapésio
		
		double b,B,h,area;
		b=6.0;
		B=8.0;
		h=5.0;
		area= (b+B)/2.0*h;
		System.out.println(area);
		
		//casting conversão explícita
		
		int d,c;
		double resultado;
		d=5;
		c=2;
		resultado=(double) d/c;
		System.out.println(resultado);
		
		double f;
		int j;
		f = 5.0;
		j = (int) f;
		System.out.println(j);

	}

}
