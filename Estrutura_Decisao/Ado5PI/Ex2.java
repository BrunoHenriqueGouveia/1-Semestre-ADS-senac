package Ado5PI;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("informe duas cores primarias :");
		String cor1 = ler.nextLine();
		String cor2 = ler.nextLine();
		String primaria = "";

		if ((cor1.equalsIgnoreCase("vermelho") && cor2.equalsIgnoreCase("azul"))
				|| (cor1.equalsIgnoreCase("azul") && cor2.equalsIgnoreCase("vermelho"))) {
			primaria = "a combinação das cores é: Roxo";
		} else if ((cor1.equalsIgnoreCase("vermelho") && cor2.equalsIgnoreCase("amarelo"))
				|| (cor1.equalsIgnoreCase("amarelo") && cor2.equalsIgnoreCase("vermelho"))) {
			primaria = "A combinação de cores é: Laranja";
		} else if ((cor1.equalsIgnoreCase("amarelo") && cor2.equalsIgnoreCase("azul"))
				|| (cor1.equalsIgnoreCase("azul") && cor2.equalsIgnoreCase("amarelo"))) {
			primaria = "A combinação de cores é: Laranja";
		} else if (cor1.equalsIgnoreCase("vermelho") && cor2.equalsIgnoreCase("vermelho")) {
			primaria = "A combinação de cores é:vermelho";
		} else if (cor1.equalsIgnoreCase("amarelo") && cor2.equalsIgnoreCase("amarelo")) {
			primaria = "A combinação de cores é:amarelo";
		} else if (cor1.equalsIgnoreCase("azul") && cor2.equalsIgnoreCase("azul")) {
			primaria = "A combinação de cores é:azul";
		} else {
			primaria = "Apenas cores primarias são aceitas";
		}

		System.out.println(primaria);
		ler.close();

	}

}
