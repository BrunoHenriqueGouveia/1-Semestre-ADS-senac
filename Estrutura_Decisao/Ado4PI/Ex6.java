package Ado4PI;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite quantas gramas deu o sorvete:");
		double gramas = ler.nextDouble();

		double conta = (gramas * 3.50) / 100;
		double conta2 = (gramas * 3) / 100;

		if (gramas < 1000 && gramas > 0) {
			System.out.printf("O valor a pagar R$: %.1f", conta);
		} else if (gramas >= 1000) {
			System.out.printf("O valor a pagar R$: %.1f", conta2);
		} else {
			System.out.printf("Peso invalido");

		}
	}
}
