package ADO7PI;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("informe a base");
		int base = ler.nextInt();

		System.out.println("informe o expoente");
		int expo = ler.nextInt();

		double resultado = 1;

		if (base < 0 || expo < 0) {
			System.err.println("numero invalido, apenas numeros naturais");
		} else {

			for (int contador = 1; contador <= expo; contador++) {

				resultado = base * resultado;

			}

			System.out.printf("%d elevado a %d é %.0f",base,expo,resultado);

		}
		ler.close();

	}

}
