package Ado4PI;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Ola,informe o dia:");
		int dia = ler.nextInt();

		System.out.println("informe dia da semana (em numero):");
		int diaSemana = ler.nextInt();

		System.out.println("informe o mês:");
		int mes = ler.nextInt();

		System.out.println("informe o ano;");
		int ano = ler.nextInt();

		String nomeMes, nomeDia;

		if (diaSemana == 0) {
			nomeDia = "Domingo";
		} else if (diaSemana == 1) {
			nomeDia = "Segunda";
		} else if (diaSemana == 2) {
			nomeDia = "Terça-feira";
		} else if (diaSemana == 3) {
			nomeDia = "Quarta-feira";
		} else if (diaSemana == 4) {
			nomeDia = "Quinta-feira";
		} else if (diaSemana == 5) {
			nomeDia = "Sexta-feira";
		} else if (diaSemana == 6) {
			nomeDia = "sabado-feira";
		} else {
			nomeDia = "Dia da semana invalido";
		}

		if (mes == 1) {
			nomeMes = "Janeiro";
		} else if (mes == 2) {
			nomeMes = "Fevereiro";
		} else if (mes == 3) {
			nomeMes = "Março";
		}

		else if (mes == 4) {
			nomeMes = "Abril";
		}

		else if (mes == 5) {
			nomeMes = "Maio";
		}

		else if (mes == 6) {
			nomeMes = "Junho";
		}

		else if (mes == 7) {
			nomeMes = "Julho";
		}

		else if (mes == 8) {
			nomeMes = "Agosto";
		}

		else if (mes == 9) {
			nomeMes = "Setembro";
		}

		else if (mes == 10) {
			nomeMes = "Outubro";
		}

		else if (mes == 11) {
			nomeMes = "Novembro";
		}

		else if (mes == 12) {
			nomeMes = "Dezembro";
		}

		else {
			nomeMes = "invalido o mês";
		}

		System.out.printf("Enviado %s , %d de %s de %d", nomeDia, dia, nomeMes, ano);

	}

}
