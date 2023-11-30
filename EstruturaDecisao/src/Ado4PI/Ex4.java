package Ado4PI;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite um numero que irei dizer o dia da semana: ");
		double num = ler.nextDouble();

		String dia = "";

		if (num == 0) {
			dia = "Domingo";
		} else if (num == 1) {
			dia = "segunda-feira";
		} else if (num == 2) {
			dia = "Terça-feira";
		} else if (num == 3) {
			dia = "Quarta-feira";
		} else if (num == 4) {
			dia = "Quinta-feira";
		} else if (num == 5) {
			dia = "Sexta-feira";
		} else if (num == 6) {
			dia = "Sabado";
		} else {
			dia = "Dia da semana invalido";
		}

		System.out.println(dia);

	}

}
