package Lista2;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe seu peso:");
		double peso = ler.nextDouble();

		System.out.println("Informe sua altura");
		double altura = ler.nextDouble();

		double imc = peso / Math.pow(altura, 2);

		String situacao;

		if (imc <= 16) {
			situacao = "Magreza severa";
		}

		else if (imc < 17) {
			situacao = "Magreza Moderada";
		} else if (imc < 18.5) {
			situacao = "Magreza Leve";
		} else if (imc < 25) {
			situacao = "NORMAL";
		} else if (imc < 30) {
			situacao = "Obsidade leve";
		} else if (imc < 40) {
			situacao = "Obsidade Severa";
		} else {
			situacao = "Obesidade Mórbida";
		}

		System.out.printf("O seu IMC é: %.1f %n situaçao: %s", imc, situacao);

	}

}
