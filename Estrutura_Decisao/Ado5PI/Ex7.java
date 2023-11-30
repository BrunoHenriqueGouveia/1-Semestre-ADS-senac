package Ado5PI;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("informe o dia da semana:");
		String dia = ler.nextLine();

		System.out.println("informe se o filme é nacional:(sim ou não)");
		String nacional = ler.nextLine();

		System.out.println("informe quantiade de ingresso:");
		System.out.print("Inteiras:");
		int inteiras = ler.nextInt();
		System.out.print("Meias:");
		int meias = ler.nextInt();

		double valor = 0;

		if (nacional.equalsIgnoreCase("sim")) {
			valor = (inteiras + meias) * 5;
		} else if (dia.contains("quarta")) {
			valor = (inteiras + meias) * 14.25;
		} else {
			double ingressoI = inteiras * 28.50;
			double ingressoM = (meias * 28.50) / 2;
			valor = ingressoI + ingressoM;
		}

		System.out.printf("O total a se pagar pelos ingressos é R$:%5.2f", valor);
		ler.close();

	}

}
