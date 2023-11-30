package Ado8PI;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("informe a quantidade de notas:");
		int tamanho = ler.nextInt();
		double media = 0;
		double[] numeros = new double[tamanho];

		System.out.println("informe as notas:");
		for (int i = 0; i < tamanho; i++) {
			numeros[i] = ler.nextDouble();
			media = media + numeros[i];
		}

		media = media / tamanho;

		for (double i : numeros) {
			double a = numeros[tamanho - 1];
			if (i == a) {
				System.out.println(i);
			} else {
				System.out.print(i + " - ");
			}
		}

		System.out.println();
		System.out.println("a media é: " + media);
		ler.close();

	}

}
