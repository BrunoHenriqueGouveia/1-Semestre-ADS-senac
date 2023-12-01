package Lista2;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe o seu sexo:");
		String sexo = ler.nextLine().substring(0, 1);

		System.out.println("Informe sua altura");
		double centimetro = ler.nextDouble() * 100;

		if (sexo.equalsIgnoreCase("M")) {

			double conta = 52 + (0.75 * (centimetro - 152.40));
			System.out.printf("O seu peso ideal é: %.1f", conta);

		} else if (sexo.equalsIgnoreCase("F")) {

			double conta = 52 + (0.67 * (centimetro - 152.40));
			System.out.printf("O seu peso ideal é: %.1f", conta);

		}

		else {
			System.err.println("Sexo invalido");

		}

	}

}
