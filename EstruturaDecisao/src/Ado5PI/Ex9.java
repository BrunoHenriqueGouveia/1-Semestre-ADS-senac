package Ado5PI;

import java.util.Random;
import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Random aleatorio = new Random();

		System.out.println("Informe se voçe quer ||PAR ou ÍMPAR||: ");
		String jogo = ler.nextLine();
		System.out.println("Informe um numero de 1 a 5:");
		int num = ler.nextInt();

		int numAleatorio = aleatorio.nextInt(1, 6);
		String situacao = "";

		if (num % 2 == 0 && numAleatorio % 2 == 0) {
			situacao = "Jogador venceu!";
		} else {
			situacao = "Maquina venceu!";
		}

		System.out.println("jogador pediu: " + jogo);
		System.out.println("jogador escolheu: " + num);
		System.out.println("Maquina escolheu: " + numAleatorio);
		System.out.println();
		System.out.println(situacao);
		ler.close();

	}

}
