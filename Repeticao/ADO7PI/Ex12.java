package ADO7PI;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("informe um numero:");
		int num = ler.nextInt();
		int numero = 0;

		for (int contador = 1; contador <= num; contador++) {

			if (num % contador == 0) {
				numero++;
			}

		}
		if (numero == 2) {
			System.out.println("É um número primo");
		}

		else {
			System.out.println("Não é um número primo.");

		}
		ler.close();

	}
}
