package Lista1;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o valor do saque (múltiplo de 5): ");
		int valorSaque = scanner.nextInt();

		int[] notas = { 100, 50, 20, 10, 5 };
		int[] quantidadeNotas = new int[notas.length];

		for (int i = 0; i < notas.length; i++) {
			quantidadeNotas[i] = valorSaque / notas[i];
			valorSaque %= notas[i];
		}

		System.out.println("Quantidade de notas necessárias:");
		for (int i = 0; i < notas.length; i++) {
			if (quantidadeNotas[i] > 0) {
				System.out.println("Notas de " + notas[i] + " reais: " + quantidadeNotas[i]);
			}
		}

	}

}
