package Ado5PI;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("digite a sigla do curso:");
		String sigla = ler.nextLine();

		System.out.print("informe se o aluno é isento da mensalidade:(sim ou não)");
		String isento = ler.nextLine();

		System.out.println("informe o valor de desconto em (%):");
		int desconto = ler.nextInt();

		double valor = 0;

		if (isento.equalsIgnoreCase("sim") || desconto == 0) {
			if (isento.equalsIgnoreCase("sim")) {
				valor = 0.00;
			} else {
				if (sigla.equalsIgnoreCase("SI")) {
					valor = 550.00;
				} else if (sigla.equalsIgnoreCase("ADS")) {
					valor = 750.00;
				} else if (sigla.equalsIgnoreCase("CS")) {
					valor = 1150.00;
				} else if (sigla.equalsIgnoreCase("EC")) {
					valor = 1300.00;
				} else if (sigla.equalsIgnoreCase("ES")) {
					valor = 950.00;
				} else {
					System.err.println("sigla invalida");
				}
			}
		} else {
			if (sigla.equalsIgnoreCase("SI")) {
				valor = 550 - (550 * desconto) / 100;
			} else if (sigla.equalsIgnoreCase("ADS")) {
				valor = 750 - (750 * desconto) / 100;
			} else if (sigla.equalsIgnoreCase("CS")) {
				valor = 1150 - (1150 * desconto) / 100;
			} else if (sigla.equalsIgnoreCase("EC")) {
				valor = 1300 - (1300 * desconto) / 100;
			} else if (sigla.equalsIgnoreCase("ES")) {
				valor = 950 - (950 * desconto) / 100;
			} else {
				System.err.println("sigla invalida");
			}

		}

		System.out.printf("Mensalidade do curso %s é R$: %5.2f",sigla,valor);
		ler.close();

	}

}
