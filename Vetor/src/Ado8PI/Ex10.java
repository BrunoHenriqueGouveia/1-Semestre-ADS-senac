package Ado8PI;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("informe a quantidade:");
		int quantidade = ler.nextInt();
		int[] numeros = new int[quantidade];
		System.out.println("informe os numeros:");
		for (int contador = 0; contador < quantidade; contador++) {
			numeros[contador] = ler.nextInt();
		}
		int[] dobro = new int[quantidade];
		for (int contador = 0; contador < quantidade; contador++) {
			dobro[contador] = (numeros[contador]) * 2;
		}

		for (int contador = 0; contador < quantidade; contador++) {
			System.out.println("O dobro de " + numeros[contador] + " é " + dobro[contador]);

		}
		ler.close();

	}

}
