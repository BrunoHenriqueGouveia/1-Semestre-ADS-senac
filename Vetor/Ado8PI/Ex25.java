package Ado8PI;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("informe o nome do projeto:");
		String nome = ler.nextLine();
		System.out.println("informe a quantidade de doações:");
		int tamanho = ler.nextInt();
		System.out.println("informe a meta:");
		int meta = ler.nextInt();

		System.out.println("informe os valor recebido:");

		int[] valor = new int[tamanho];
		int soma = 0;
		int maior = 0;

		for (int i = 0; i < tamanho; i++) {
			valor[i] = ler.nextInt();
			soma = soma + valor[i];
			if (valor[i] > maior) {
				maior = valor[i];
			}
		}

		System.out.printf("O projeto %s recebeu %d doações totalizando %d reais.%n", nome, tamanho, soma);
		System.out.println();
		System.out.println("as doações recebidas foram:");
		for (int i : valor) {
			System.out.print(i + " - ");
		}
		System.out.println();
		System.out.println("A maior doação foi:" + maior);
		if (soma >= meta) {
			System.out.println("A meta foi atingida");
		} else {
			System.out.println("A meta não foi atingida");
		}
		ler.close();
	}

}
