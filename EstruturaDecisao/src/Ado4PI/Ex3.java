package Ado4PI;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("ola, informe total da renda mensal da familia");
		double ganhos = ler.nextDouble();

		System.out.println("ola, informe total de gastos da familia");
		double gasto = ler.nextDouble();

		String familia = "";

		if (ganhos >= gasto) {
			familia = "VOÇE ESTA DENTRO DO ORÇAMENTO";
		} else {
			familia = "VOÇE ESTA FORA DO ORÇAMENTO! não gaste mais.";
		}
		System.out.println(familia);

	}

}
