package Ado5PI;

import java.util.Random;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Random aleatorio = new Random();

		System.out.println("JOKENPÔ");
		System.out.println("informe sua jogada");
		System.out.println("Pedra,Papel ou Tesoura:");
		String jokenpo = ler.nextLine();

		int numAleatorio = aleatorio.nextInt(1, 4);
		String situacao = "";
		String maquina = "";

		if (jokenpo.equalsIgnoreCase("pedra") && numAleatorio == 1) {
			situacao = "ninguem ganhou!!";
			maquina = "pedra";
		}
		if (jokenpo.equalsIgnoreCase("papel") && numAleatorio == 2) {
			situacao = "ninguem ganhou!!";
			maquina = "papel";
		}
		if (jokenpo.equalsIgnoreCase("tesoura") && numAleatorio == 3) {
			situacao = "ninguem ganhou!!";
			maquina = "tesoura";
		}

		if ((jokenpo.equalsIgnoreCase("pedra") || jokenpo.equalsIgnoreCase("papel"))
				&& (numAleatorio == 1 || numAleatorio == 2)) {
			if (jokenpo.equalsIgnoreCase("pedra") && numAleatorio == 2) {
				situacao = "Maquina venceu";
				maquina = "papel";
			} else {
				situacao = "Jogador venceu";
				maquina = "pedra";
			}
		} else if ((jokenpo.equalsIgnoreCase("tesoura") || jokenpo.equalsIgnoreCase("papel"))
				&& (numAleatorio == 3 || numAleatorio == 2)) {
			if (jokenpo.equalsIgnoreCase("tesoura") && numAleatorio == 2) {
				situacao = "Jogador venceu";
				maquina = "papel";
			} else {
				situacao = "Maquina venceu";
				maquina = "tesoura";
			}
		} else if ((jokenpo.equalsIgnoreCase("tesoura") || jokenpo.equalsIgnoreCase("pedra"))
				&& (numAleatorio == 3 || numAleatorio == 1)) {
			if (jokenpo.equalsIgnoreCase("tesoura") && numAleatorio == 1) {
				situacao = "Maquina venceu";
				maquina = "pedra";
			} else {
				situacao = "Jogador venceu";
				maquina = "tesoura";
			}
		} else {
			System.err.println("Opção invalida");
		}
		System.out.println("Joo-kenn-poo!");
		System.out.println("jogador: " + jokenpo);
		System.out.println("Maquina: " + maquina);
		System.err.println(situacao);
		ler.close();

	}

}
