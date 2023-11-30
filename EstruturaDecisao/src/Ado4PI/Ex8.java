package Ado4PI;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Ola,informe sua 1º nota:");
		double nota1 = ler.nextDouble();

		System.out.println("Ola,informe sua 2º nota:");
		double nota2 = ler.nextDouble();

		System.out.println("Ola,informe sua 3º nota:");
		double nota3 = ler.nextDouble();

		double media = (nota1 + nota2 + nota3) / 3;

		String situacao;

		if (media >= 8) {
			situacao = "Aprovado com sucesso";
		} else if (media >= 6) {
			situacao = "Aprovado";
		} else if (media >= 3) {
			situacao = "Recuperação";
		} else if (media < 3 & media > 0) {
			situacao = "Reprovado";
		} else {
			situacao = "Desistente";
		}
		System.out.printf(" A media do aluno é %.1f %n A situação do aluno é: %s ", media, situacao);

	}

}
