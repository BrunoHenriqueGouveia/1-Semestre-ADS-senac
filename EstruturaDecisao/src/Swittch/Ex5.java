package Swittch;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("informe um numero de 1 ate 5:");
		int num = ler.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("informe a base:");
			double base = ler.nextDouble();
			System.out.println("informe altura:");
			double altura = ler.nextDouble();
			double conta = (base*altura) / 2;
			System.out.println(conta);
			break;
		case 2 :
			System.out.println("informe o espaco:");
			double espaco = ler.nextDouble();
			System.out.println("informe o tempo");
			double tempo = ler.nextDouble();
			double conta1 = espaco / tempo;
			System.out.println(conta1);
			break;
		case 3:
			System.out.println("informe um numero");
			double mm = ler.nextDouble()/25.4;
			System.out.println(mm);
			break;
		case 4:
			System.out.println("informe um numero:");
			double c = ler.nextDouble()+ 273.15;
			break;
		case 5:
			System.out.println("informe um numero");
			double raiz = ler.nextDouble();
			double conta2 = Math.PI + Math.pow(raiz,2);
			System.out.println(conta2);
					
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
