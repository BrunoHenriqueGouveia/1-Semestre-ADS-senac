package ADO7PI;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("informe o numero de inicio");
		int numInicio = ler.nextInt();

		System.out.println("informe o numero de fim");
		int numFim = ler.nextInt();

		int soma = 0;

		for (int contador = numInicio; contador <= numFim; contador++) {
			if (contador % 2 == 0) {
				soma = soma + contador;
			}

		}
		System.out.printf("A soma de numeros pares de %d ate %d é %d",numInicio,numFim,soma);
		ler.close();

	}

}
