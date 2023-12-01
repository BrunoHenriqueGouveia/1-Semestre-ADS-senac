package Ado4PI;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Ola,informe a temperatura do seu corpo:");
		double temperatura = ler.nextDouble();

		String situacao;

		if (temperatura >= 41) {
			situacao = "HIpertermia";
		} else if (temperatura >= 39.6) {
			situacao = "Febre Alta";
		} else if (temperatura >= 37.6) {
			situacao = "Febre";
		} else if (temperatura >= 36) {
			situacao = "Normal";
		} else {
			situacao = "Hipotermia";
		}
		System.out.println("Sua situaçao para temperatura é " + situacao);

	}

}
