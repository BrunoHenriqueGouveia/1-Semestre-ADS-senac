package Ado8PI;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Fórmula 1");
		System.out.println("informe a quantidade de competidores:");
		int tamanho = ler.nextInt();

		int posicoes = 0;
		int[] largada = new int[tamanho];
		int[] chegada = new int[tamanho];

		System.out.println("informe as posições de largada:");
		for (int i = 0; i < tamanho; i++) {
			largada[i] = ler.nextInt();
		}
		System.out.println("informe as posições na chegada:");
		for (int i = 0; i < tamanho; i++) {
			chegada[i] = ler.nextInt();
		}

		for (int i = 0; i < tamanho; i++) {
			if (chegada[i] > largada[i]) {
				posicoes = chegada[i] - largada[i];
				System.out.printf("o piloto %d avançou %d posições%n", i + 1, posicoes);
			} else if (chegada[i] < largada[i]) {
				posicoes = largada[i] - chegada[i];
				System.out.printf("o piloto %d retrocedeu %d posições%n", i + 1, posicoes);
			} else {
				System.out.printf("o piloto %d manteve a posições%n", i + 1);
			}
		}
		ler.close();

	}

}
