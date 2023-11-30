package Swittch;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("informe o seu tipo de plano de saúde:");
		String plano = ler.nextLine().toLowerCase();
		String valor = "";

		switch (plano) {
		case "básico":
			valor = "R$:150,00";
			break;

		case "bronze":
			valor = "R$:220,00";
			break;

		case "prata":
			valor = "R$:310,00";
			break;

		case "ouro":
			valor = "R$:450,00";
			break;

		default:
			valor = "Plano invalido";
		}
		System.out.println("o valor do seu plano é:" + valor);
		ler.close();
		

	}

}
