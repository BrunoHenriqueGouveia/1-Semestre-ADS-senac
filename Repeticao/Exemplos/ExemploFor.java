package Exemplos;

import java.util.Scanner;

public class ExemploFor {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
       
		/*System.out.println("informe um numero de inicio:");
		int num = ler.nextInt();

		System.out.println("informe um numero final");
		int numfinal = ler.nextInt();

		printMultiplo4e5(num, numfinal);
		*/
		long inicio , fim;
		
		System.out.println("informe um numero:");
		int primo = ler.nextInt();
		
		inicio =System.currentTimeMillis();
		System.out.println("o numero informado é primo: "+ ehPrimos(primo));
		fim = System.currentTimeMillis();
		System.out.println(fim);
		System.out.println(fim - inicio);
	

	}

	public static void printTabuada(int num, int limiteTabuada) {
		for (int i = 1; i <= limiteTabuada; i++) {
			System.out.printf("%2d x %2d = %3d%n", num, i, num * i);
		}

	}

	public static void printMultiplo4e5(int valorInicial, int valorFinal) {
		for (int i = valorInicial; i <= valorFinal; i++) {
			if (i % 4 == 0 && i % 5 == 0) {
				System.out.printf("multiplo de 4 e de 5 é %3d%n", i);
		   }
		}
      }

	public static boolean ehPrimos(int num) {
		boolean primo;
		int qtd=0;
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				qtd++;
				if(qtd > 2) {
					break;
				}
			}
		}
		primo = qtd == 2;
		return primo;
	}
}
