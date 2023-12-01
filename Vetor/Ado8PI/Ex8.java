package Ado8PI;

import java.util.Random;
import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Random aleatorio = new Random();

		System.out.println("informe a quantidade:");
		int quantidade = ler.nextInt();

		int[] vetor = new int[quantidade];

		for (int contador = 0; contador < quantidade; contador++) {
			int numeros = aleatorio.nextInt(0, 101);
			vetor[contador] = numeros;
		}
		System.out.println("os numeros aleatorios gerados foi:");
		for (int contador : vetor) {
			System.out.println(contador);
		}
		ler.close();

	}

}
