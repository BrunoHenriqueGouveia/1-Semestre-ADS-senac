package Ado8PI;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("informe a quantidade de nomes:");
		int tamanho = ler.nextInt();

		String[] nomes = new String[tamanho];

		System.out.println("informe os nomes:");

		for (int i = 0; i < tamanho; i++) {
			nomes[i] = ler.next().toUpperCase();
		}

		System.out.println("os nomes que iniciam com L são:");
		for (String nome : nomes) {
			if (nome.startsWith("L")) {
				System.out.println(nome);
			}
		}
      ler.close();
	}

}
