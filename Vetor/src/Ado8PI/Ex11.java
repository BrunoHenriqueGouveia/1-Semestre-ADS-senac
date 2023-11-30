package Ado8PI;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("informe o tamanho dos vetores:");
		int tamanho = ler.nextInt();

		int soma = 0;
		int[] numeros1 = new int[tamanho];
		int[] numeros2 = new int[tamanho];

		System.out.println("primeiro vetor:");
		for (int i = 0; i < tamanho; i++) {
			numeros1[i] = ler.nextInt();
		}
		System.out.println("segundo vetor:");
		for (int i = 0; i < tamanho; i++) {
			numeros2[i] = ler.nextInt();
		}
		System.out.println("a soma dos vetores, resulta no terceiro:");
		for (int i = 0; i < tamanho; i++) {

			soma = numeros1[i] + numeros2[i];
			System.out.println(soma);
		}
		ler.close();

	}

}
