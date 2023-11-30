package Ado8PI;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("informe a quantidades de numeros a ser guardados:");
		int quantidades = ler.nextInt();

		int[] numeros = new int[quantidades];

		System.out.println("informe os numeros:");

		for (int contador = 0; contador < quantidades; contador++) {
			numeros[contador] = ler.nextInt();
		}
		System.out.println("os numeros informados:");
		for (int contador : numeros) {
			System.out.println(contador);
		}
		ler.close();

	}

}
