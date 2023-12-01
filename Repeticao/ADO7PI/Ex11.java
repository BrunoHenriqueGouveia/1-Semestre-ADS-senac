package ADO7PI;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int nota1 = 0, nota2 = 0, nota3 = 0;
		String notaInvalida = "Nota inválida. Ela deve estar entre 0 e 10 \ntente novamente:";

		for (int contador = 1; contador == 1; contador++) {
			System.out.println("informe a 1° nota:");
			nota1 = ler.nextInt();

			if (nota1 < 1 || nota1 > 10) {
				System.out.println(notaInvalida);
				contador--;
			}

		}
		for (int contador = 1; contador == 1; contador++) {
			System.out.println("informe a 2° nota:");
			nota2 = ler.nextInt();

			if (nota2 < 1 || nota2 > 10) {
				System.out.println(notaInvalida);
				contador--;
			}

		}

		for (int contador = 1; contador == 1; contador++) {
			System.out.println("informe a 3° nota:");
			nota3 = ler.nextInt();

			if (nota3 < 1 || nota3 > 10) {
				System.out.println(notaInvalida);
				contador--;
			}

		}
		double media = (nota1 + nota2 + nota3) / 3;
		System.out.println("Media calculada: " + media);
		ler.close();

	}

}
