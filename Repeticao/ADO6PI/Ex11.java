package ADO6PI;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite a frase: ");
		String frase = ler.nextLine();
		int letra = 0;

		while (letra < frase.length()) {
			char caractere = frase.charAt(letra);
			String primeiroNome = frase.substring(0, frase.indexOf(" "));
			if (caractere == ' ') {
				System.out.println("Espaço");
			} else {
				if (letra < primeiroNome.length()) {
					System.out.println("Letra: " + (letra + 1) + "= " + caractere);
				} else {
					System.out.println("Letra: " + (letra) + "= " + caractere);
				}

			}

			letra++;
		}
		ler.close();

	}

}
