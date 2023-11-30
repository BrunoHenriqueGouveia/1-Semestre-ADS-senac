package Ado8PI;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("informe a quantidade de notas:");
		int tamanho = ler.nextInt();

		double[] numeros = new double[tamanho];
		double maior = 0;

		System.out.println("informe as notas:");
		
		for (int i = 0; i < tamanho; i++) {
			numeros[i] = ler.nextDouble();
			if (numeros[i] > maior) {
				maior = numeros[i];
			}
		}
		for (double i : numeros) {
			double a = numeros[tamanho - 1];
			if (i == a) {
				System.out.println(i);
			} else {
				System.out.print(i + " - ");
			}
		}
		System.out.println();
		System.out.println("A maior nota é: " + maior);
		ler.close();

	}

}
