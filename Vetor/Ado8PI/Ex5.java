package Ado8PI;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("informe um numero:");
		int tabuada = ler.nextInt();

		int[] numeros = new int[11];

		for (int contador = 0; contador <= 10; contador++) {
			numeros[contador] = (tabuada * contador);
		}
		System.out.println("tabuada: " + tabuada);
		for (int contador : numeros) {
			System.out.println(contador);
		}
		ler.close();

	}

}
