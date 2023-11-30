package Ado8PI;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("informe a quantidade de notas:");
		int tamanho = ler.nextInt();

		double[] numeros = new double[tamanho];
		double maior = 0;
		double menor = 10;
		double media = 0;

		System.out.println("informe as notas:");

		for (int i = 0; i < tamanho; i++) {
			numeros[i] = ler.nextDouble();
			media = media + numeros[i];
			if (numeros[i] > maior) {
				maior = numeros[i];
			}
			if (numeros[i] < menor) {
				menor = numeros[i];
			}
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
		System.out.println("A media é:" + media);
		System.out.println("A maior nota é: " + maior);
		System.out.println("A menor nota é:" + menor);
		ler.close();

	}

}
