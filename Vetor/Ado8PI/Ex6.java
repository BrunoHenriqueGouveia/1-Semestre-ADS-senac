package Ado8PI;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("informe uma frase:");
		String frase = ler.nextLine();

		char[] numeros = new char[frase.length()];

		for (int contador = 0; contador < frase.length(); contador++) {
			char letra = frase.charAt(contador);
			numeros[contador] = letra;
		}
		for (char contador : numeros) {
			System.out.println(contador);
		}
		ler.close();

	}

}
