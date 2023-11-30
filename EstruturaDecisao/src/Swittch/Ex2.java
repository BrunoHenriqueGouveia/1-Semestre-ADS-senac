package Swittch;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("informe o codigo do produto:");
		String codigo = ler.nextLine();

		System.out.println("informe a quantidade:");
		int quantidade = ler.nextInt();

		double valor = 0;

		switch (codigo) {
		case "A001":
			valor = multiplicar(quantidade, 7.50);
			break;

		case "A002":
			valor = multiplicar(quantidade, 9.90);
			break;

		case "A003":
			valor = multiplicar(quantidade, 14);
			break;

		case "A004":
			valor = multiplicar(quantidade, 19.99);
			break;

		default:
			System.err.println("codigo inválido");
		}

		System.out.println("O valor é: " + valor);
		ler.close();

	}

	public static double multiplicar(double n1, double n2) {
		return n1 * n2;
	}
}
