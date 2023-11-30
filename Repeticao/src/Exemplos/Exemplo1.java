package Exemplos;

import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("informe um numero");
		int num = ler.nextInt();

		int volta = num;
		int fatora = 1;

		while (volta > 1) {
			fatora = fatora * volta;

			volta--;
		}
		System.out.println("a fotoração de " + num + " é " + fatora);
		System.exit(0);

		System.out.println("Informe o ultimo numero");
		int tabuada = ler.nextInt();

		int numero = 1;

		while (numero <= 10) {
			int mult = tabuada * numero;
			System.out.printf("%d x %d = %d %n", tabuada, numero, mult);
			numero++;
		}

	}

}
