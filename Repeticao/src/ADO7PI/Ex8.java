package ADO7PI;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("informe uma frase:");
		String frase = ler.nextLine().toUpperCase();

		int quantidade = frase.length();

		for (int contador = 0; contador < quantidade; contador++) {
			char letra = frase.charAt(contador);

			if (letra == ' ') {
				System.out.print("");
			} else if ((quantidade - 1) == contador) {
				System.out.print(letra);

			} else {
				System.out.print(letra + "-");

			}

		}
		ler.close();

	}

}
