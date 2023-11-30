package Ado4PI;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("informe o tipo de ingresso MEIA ou INTEIRA:");
		String tipo = ler.nextLine();

		System.out.println("informe a quantidade de ingressos");
		int quantidade = ler.nextInt();

		double meia = (quantidade * 28.50) / 2;
		double inteira = quantidade * 28.50;

		if (tipo.equalsIgnoreCase("meia")) {
			System.out.printf("O total a pagar é R$: %.2f ", meia);
		} else if (tipo.equalsIgnoreCase("inteira")) {
			System.out.printf("O total a pagar é R$: %.2f", inteira);
		} else {
			System.err.println("opção invalida");
		}

	}

}
