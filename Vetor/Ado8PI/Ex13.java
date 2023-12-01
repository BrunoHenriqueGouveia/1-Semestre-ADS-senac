package Ado8PI;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("informe a quantidade:");
		int tamanho = ler.nextInt();

		int[] numeros = new int[tamanho];

		for (int i = 0; i < tamanho; i++) {
			numeros[i] = ler.nextInt();
		}

		System.out.println("voçê digitou os números");
		for (int i : numeros) {
			System.out.println(i);
		}
		System.out.println("os numeros pares:");
		for (int i : numeros) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
        ler.close();
	}

}
