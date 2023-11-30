package Lista2;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Informe seu salario base:");
		double salario = ler.nextDouble();

		System.out.print("Informe gratificação:");
		double bonus = ler.nextDouble();

		double salarioBruto = salario + bonus;
		double imposto10 = (10 * salarioBruto) / 100;
		double imposto15 = (15 * salarioBruto) / 100;

		if (salario <= 2500) {
			double salarioliquido = salarioBruto - imposto10;
			System.out.printf("O salario bruto: %5.2f %n", salarioBruto);
			System.out.printf("Gratificação: %5.2f %n", bonus);
			System.out.printf("O valor do imposto é: %5.2f %n", imposto10);
			System.out.printf("O salario liquido: %5.2f", salarioliquido);

		} else {
			double salarioliquido = salarioBruto - imposto15;
			System.out.printf("O salario bruto: %5.2f %n", salarioBruto);
			System.out.printf("Gratificação: %5.2f %n", bonus);
			System.out.printf("O valor do imposto é: %5.2f %n", imposto15);
			System.out.printf("O salario liquido: %5.2f", salarioliquido);

		}

	}

}
