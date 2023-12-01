package ADO6PI;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Ola,informe uma frase");
		String frase = ler.nextLine();
		int posicao = 0;

		while (posicao < frase.length()) {
			char letra = frase.charAt(posicao);
			System.out.println(letra);
			posicao++;
		}
		ler.close();

	}

}
