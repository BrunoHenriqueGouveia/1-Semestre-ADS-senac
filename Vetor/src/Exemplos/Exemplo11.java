package Exemplos;

import java.util.Random;

public class Exemplo11 {

	public static void main(String[] args) {
		Random gerador = new Random();

		int[][] vetorBi = new int[7][7];
		int soma = 0;
		double multi = 1;
		
		
		for (int i = 0; i < vetorBi.length; i++) {
			for (int j = 0; j < vetorBi[i].length; j++) {

				vetorBi[i][j] = gerador.nextInt(1, 10);

				if (i % 2 == 0) {
					multi *= vetorBi[i][j];
				} else {
					soma += vetorBi[i][j];
				}
			}
		}

		for (int i = 0; i < vetorBi.length; i++) {
			for (int j = 0; j < vetorBi[i].length; j++) {

				System.out.print(vetorBi[i][j] + ", ");

			}
			System.out.println();
		}

		System.out.println("A soma dos numeros da linha impares são:" + soma);
		System.out.println("A Multiplicação dos numeros da linha pares são:" + multi);

	}

}
