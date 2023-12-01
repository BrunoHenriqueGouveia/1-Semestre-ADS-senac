package Lista1;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o valor de saque");
		double saque = ler.nextDouble();

		double nota100 = saque / 100;
		double nota50 = saque / 50;
		double nota20 = saque / 20;
		double nota10 = saque / 10;
		double nota5 = saque / 5;
		String podeSacar;

		if (saque % 5 >= 1) {
			podeSacar = "O valor desejado nao pode sacar";
		} else {

			if (nota100 >= 1 && saque % 10 == 0) {
				podeSacar = "Voçe podera sacar" + nota100 + "notas de 100";
			}

			else if (nota50 >= 1 ) {
				podeSacar = "Voçe podera sacar" + nota50 + "notas de 50";
			}

			else if (nota20 >= 1 && saque % 5 == 0) {
				podeSacar = "Voçe podera sacar" + nota20 + "notas de 20";
			} else if (nota10 >= 1 && saque % 5 == 0) {
				podeSacar = "Voçe podera sacar" + nota10 + "notas de 10";
			} else {
				podeSacar = "Voçe podera sacar" + nota5 + "notas de 5";
			}
		}

		System.out.println(podeSacar);
	}

}
