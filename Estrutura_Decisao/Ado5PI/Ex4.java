package Ado5PI;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("informe o nome da operação:");
		String nome = ler.nextLine();
		System.out.println("informe o 1° numero:");
		double num1 = ler.nextDouble();
		System.out.println("informe o 2° numero:");
		double num2 = ler.nextDouble();

		double soma = num1 + num2;
		double subtracao = num1 - num2;
		double multiplicacao = num1 * num2;
		double divisao = num1 / num2;
		double restDivisao = num1 % num2;
		double potencia = Math.pow(num1, num2);

		if (nome.equalsIgnoreCase("soma")) {
			System.out.printf("A soma de %.0f + %.0f = %.0f", num1, num2, soma);
		} else if (nome.equalsIgnoreCase("subtração")) {
			System.out.printf("A Subtração de %.0f - %.0f = %.0f", num1, num2, subtracao);
		} else if (nome.equalsIgnoreCase("multiplicação")) {
			System.out.printf("A Multiplicação de %.0f x %.0f = %.0f", num1, num2, multiplicacao);
		} else if (nome.equalsIgnoreCase("divisão")) {
			System.out.printf("A Divisão de %.0f / %.0f = %.0f", num1, num2, divisao);
		} else if (nome.equalsIgnoreCase("Resto da divisão")) {
			System.out.printf("O resto da divisão de %.0f e %.0f = %.0f", num1, num2, restDivisao);
		} else if (nome.equalsIgnoreCase("Potência")) {
			System.out.printf("A Potência de %.0f elevado %.0f = %.0f", num1, num2, potencia);
		} else {
			System.err.println("Operação não suportada");
		}
		ler.close();

	}

}
