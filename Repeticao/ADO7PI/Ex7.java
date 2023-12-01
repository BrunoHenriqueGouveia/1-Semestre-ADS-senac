package ADO7PI;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("informe uma frase:");
		String frase = ler.nextLine();

		int caractere = frase.length();

		for (int contador = 0; contador < caractere; contador++) {
			char letra = frase.charAt(contador);
			System.out.print(letra + "-");
		}
		ler.close();

	}

}
