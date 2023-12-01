package Ado8PI;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("informe a quantidade de alunos:");
		int tamanho = ler.nextInt();

		double[] numeros = new double[tamanho];
		String passou = "Todos alunos passaram";

		System.out.println("informe a media dos alunos:");

		for (int i = 0; i < tamanho; i++) {
			numeros[i] = ler.nextDouble();

			if (numeros[i] < 6) {
				passou = "Não foram todos alunos que passaram";
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
		System.out.println(passou);
		ler.close();

	}

}
