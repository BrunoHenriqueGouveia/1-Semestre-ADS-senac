package Ado8PI;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("informe a quantidade:");
		int quantidade = ler.nextInt();
		int[] numeros = new int[quantidade];
		System.out.println("informe os numeros:");
		for (int contador = 0; contador < quantidade; contador++) {
			numeros[contador] = ler.nextInt();
		}
		double[] dobro = new double[quantidade];
		for (int contador = 0; contador < quantidade; contador++) {
			dobro[contador] = (numeros[contador]) * 2;
		}
		System.out.println("voçe digitou os numeros:");
		for (int contador : numeros) {
			System.out.println(contador);
		}
		System.out.println("o dobro é:");
		for (double contador : dobro) {
			System.out.println(contador);
		}
		ler.close();

	}

}
