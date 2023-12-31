package Decisao;

import java.util.Scanner;

public class Pontoextra {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Ola, porfessor informe o valor que voçe ganha por aula:");
		double ganhoAula = ler.nextDouble();

		System.out.println("informe quantas aulas por semana:");
		double aulasSemana = ler.nextDouble();

		double salarioBase = (aulasSemana * 4.5) * ganhoAula;
		double horaAtividade = (salarioBase * 5) / 100;
		double dsr = (salarioBase + horaAtividade) / 6;
		double salarioBruto = salarioBase + horaAtividade + dsr;
		double inss;
		double irrf;
		if (salarioBruto < 1320) {
			inss = (salarioBruto * 7.5) / 100;
		} else if (salarioBruto >= 1320 && salarioBruto < 2571.29) {
			inss = (salarioBruto * 9) / 100;
		} else if (salarioBruto >= 2571.29 && salarioBruto < 3856.94) {
			inss = (salarioBruto * 12) / 100;
		} else if (salarioBruto >= 3856.93 && salarioBruto < 7507.49) {
			inss = (salarioBruto * 14) / 100;
		} else {
			inss = 877.24;
		}

		System.out.println("informe quantos dependendes voçe tem: ");
		double dependentes = ler.nextDouble() * 189.59;

		System.out.println("informe valor de descontos (pensão,etc..):");
		double descontos = ler.nextDouble();

		double base = salarioBruto - inss - descontos - dependentes;

		if (base >= 1903.99 && base < 2826.65) {
			irrf = (base * (7.5 / 100)) - 142.80;
		} else if (base >= 2826.66 && base < 3751.05) {
			irrf = (base * (15 / 100)) - 354.80;
		} else if (base >= 3751.05 && base < 4664.68) {
			irrf = (base * (22.5 / 100)) - 636.13;
		} else if (base >= 4664.68) {
			irrf = (base * (27.5 / 100)) - 869.36;
		} else {
			irrf = 0;
		}
		double salarioLiquido = salarioBruto - inss - irrf;

		System.out.println("---------------------------");
		System.out.printf("|Salario Bruto:%5.2f    |%n", salarioBruto);
		System.out.printf("|Salario liquido:%5.2f  |%n", salarioLiquido);
		System.out.printf("|Impostos inss:%5.2f     |%n", inss);
		System.out.printf("|Impostos irrf:%5.2f     |%n", irrf);
		System.out.println("---------------------------");

	}

}
