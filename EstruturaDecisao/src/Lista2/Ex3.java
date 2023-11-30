package Lista2;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("informe seu salario:");
		double salario = ler.nextDouble();

		double bonus10 = (salario * 10) / 100;
		double bonus8 = (salario * 8) / 100;
		double bonus5 = (salario * 5) / 100;

		double auxilioMenor = salario + 350;
		double auxilioMaior = salario + 300;

		if (salario <= 2000) {

			double salarionovo = auxilioMenor + bonus10;
			System.out.printf("O seu novo salario é:%5.2f", salarionovo);

		} else if (salario > 2000 && salario <= 3000) {
			if (salario <= 2500) {
				double salarionovo = auxilioMenor + bonus8;
				System.out.printf("O seu novo salario é:%5.2f", salarionovo);
			} else {
				double salarionovo = auxilioMaior + bonus8;
				System.out.printf("O seu novo salario é:%5.2f", salarionovo);
			}

		}

		else {
			double salarionovo = auxilioMaior + bonus5;
			System.out.printf("O seu novo salario é:%5.2f", salarionovo);

		}

	}

}
