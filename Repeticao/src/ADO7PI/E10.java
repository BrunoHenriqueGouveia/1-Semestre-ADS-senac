package ADO7PI;

import java.util.Scanner;

public class E10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("informe uma frase:");
		String frase = ler.nextLine();
		String resultado = "";

		for (int contador = 0; contador < frase.length(); contador++) {
			char letra = frase.charAt(contador);
			resultado = letra + resultado;
		}

		if (resultado.equalsIgnoreCase(frase)) {
			System.out.println("É um palíndromo");
		} else {
			System.out.println("Não é um palíndromo");
		}

		ler.close();

	}

}
