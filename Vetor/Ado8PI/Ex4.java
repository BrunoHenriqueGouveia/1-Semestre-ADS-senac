package Ado8PI;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("informe a quantidade de numeros a ser guardado:");
		int quantidade = ler.nextInt();

		int[] numeros = new int[quantidade];

		System.out.println("digite os numeros");
		for (int contador = (quantidade - 1); contador >= 0; contador--) {
			numeros[contador] = ler.nextInt();
		}
		System.out.println("voçe digitou:");
		for (int contador : numeros) {
			System.out.println(contador);
		}
		ler.close();

	}

}
