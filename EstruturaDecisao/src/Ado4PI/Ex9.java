package Ado4PI;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Ola,informe seu peso:");
		double peso = ler.nextDouble();

		System.out.println("Ola,informe sua altura:");
		double altura = ler.nextDouble();

		double imc = peso / Math.pow(altura, 2);

		String situacao;

		if (imc >= 40) {
			situacao = "Obesidade grau |||";
		} else if (imc >= 35) {
			situacao = "Obesidade ||";
		} else if (imc >= 30) {
			situacao = "Obesidade |";
		} else if (imc >= 25) {
			situacao = "Sobrepeso";
		}

		else if (imc >= 18.5) {
			situacao = "Peso ideal";
		} else {
			situacao = "peso baixo";
		}
		System.out.printf("Seu IMC é %.1f %n Sua classificação é: %s", imc, situacao);

	}

}
