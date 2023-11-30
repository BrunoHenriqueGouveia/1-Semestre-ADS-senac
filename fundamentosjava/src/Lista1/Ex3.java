package Lista1;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("informe o ponto x2");
		double x2 = ler.nextDouble();
		
		System.out.println("informe o ponto x1");
		double x1 = ler.nextDouble();
		
		System.out.println("informe o ponto y2");
		double y2 = ler.nextDouble();
		
		System.out.println("informe o ponto y1");
		double y1 = ler.nextDouble();
		
		double resultado = Math.sqrt(Math.pow(x2-x1 , 2) + Math.pow(y2-y1,2));
		
		System.out.printf(" a distancia entre p1(%.0f - %.0f) e p2 (%.0f - %.0f) é de %.0f", x2, x1, y2,y1,resultado);
	    
	}

}
