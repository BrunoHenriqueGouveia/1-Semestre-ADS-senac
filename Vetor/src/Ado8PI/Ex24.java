package Ado8PI;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("informe o nome do projeto:");
		String nome = ler.nextLine();

		System.out.println("informe os valor recebido:");

		int[] valor = new int[100];
		int soma = 0;
		int contador = 0;

		for (int i = 1; i != 0; i++) {
			valor[contador] = ler.nextInt();
			if (valor[contador] == -1) {
				break;
			}
			soma = soma + valor[contador];
			contador++;

		}
		System.out.printf("O projeto %s recebeu %d doações totalizando %d reais.%n", nome, contador, soma);
		System.out.println("as doações recebidas foram:");
		for (int i = 0; i < contador; i++) {
			System.out.print(valor[i] + "-");
		}
       ler.close();
	}

}
