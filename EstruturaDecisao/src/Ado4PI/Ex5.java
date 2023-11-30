package Ado4PI;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Digite o numero do mês: ");
		int num = ler.nextInt();

		String mes = "";

		if (num == 1) {
			mes = "Janeiro";
		} else if (num == 2) {
			mes = "Fevereiro";
		} else if (num == 3) {
			mes = "Março";
		} else if (num == 4) {
			mes = "Abril";
		} else if (num == 5) {
			mes = "Maio";
		} else if (num == 6) {
			mes = "Junho";
		} else if (num == 7) {
			mes = "Julho";
		} else if (num == 8) {
			mes = "Agosto";
		} else if (num == 9) {
			mes = "Setembro";
		} else if (num == 10) {
			mes = "Outubro";
		} else if (num == 11) {
			mes = "Novembro";
		} else if (num == 12) {
			mes = "Dezembro";
		} else {
			mes = "Mês invalido";
		}

		System.out.println(mes);

	}

}
