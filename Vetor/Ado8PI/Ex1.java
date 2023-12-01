package Ado8PI;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("informe 5 numeros:");
		int num1 = ler.nextInt();
		int num2 = ler.nextInt();
		int num3 = ler.nextInt();
		int num4 = ler.nextInt();
		int num5 = ler.nextInt();

		int[] numeros = new int[] { num1, num2, num3, num4, num5 };
		System.out.println("voçe digitou:");

		for (int contador : numeros) {
			System.out.println(contador);
		}
		ler.close();

	}

}
