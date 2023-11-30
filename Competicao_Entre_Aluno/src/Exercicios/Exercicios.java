package Exercicios;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		Ex6();

		ler.close();

	}

	public static void Ex1() {
		Scanner ler = new Scanner(System.in);
		int irma1 = 0, irma2 = 0, irma3 = 0;

		do {
			System.out.println("informe as idades das 3 irmãs:");
			irma1 = ler.nextInt();
			irma2 = ler.nextInt();
			irma3 = ler.nextInt();
		} while (irma1 < 5 || irma1 > 10 || irma2 < 5 || irma2 > 100 || irma3 < 5 || irma3 > 100);

		int situacao = 0;

		if ((irma1 >= irma2 && irma1 <= irma3) || (irma1 >= irma3 && irma1 <= irma2)) {
			situacao = irma1;
		} else if ((irma2 >= irma1 && irma2 <= irma3) || (irma2 >= irma3 && irma2 <= irma1)) {
			situacao = irma2;
		} else if ((irma3 >= irma1 && irma3 <= irma2) || (irma3 >= irma2 && irma3 <= irma1)) {
			situacao = irma3;
		}

		System.out.println(situacao);
		ler.close();
	}

	public static void Ex2() {
		Scanner ler = new Scanner(System.in);

		int time1 = 0, time2 = 0;
		System.out.println("informe o nivel de jogo dos jogadores:");
		int[] numeros = new int[4];

		for (int i = 0; i < 4; i++) {
			numeros[i] = ler.nextInt();
			if (numeros[i] <= 0 || numeros[i] >= 10000) {
				System.out.println("nivel invalido \nSó pode de 1 a 9999");
				System.out.println("tente novamente");
				i--;
			} else if (i == 0 || i == 3) {
				time1 = time1 + numeros[i];
			} else {
				time2 = time2 + numeros[i];
			}

		}

		System.out.println(time1 - time2);
		ler.close();

	}

	public static void Ex3() {

	}

	public static void Ex4() {
		Scanner ler = new Scanner(System.in);

		System.out.println("informe a quota mensal de megabytes");
		int quota = ler.nextInt();

		System.out.println("informe o numero de meses:");
		int meses = ler.nextInt();

		int numeros = 0;
		int valor = 0;
		System.out.println("informe os valores dos meses");
		for (int i = 0; i < meses; i++) {
			numeros = ler.nextInt();

			valor = valor + numeros;
		}

		valor = ((quota * meses) - valor) + quota;
		System.out.println(valor);
		ler.close();
	}

	public static void Ex5() {
		Scanner ler = new Scanner(System.in);

		int contador = 0;
		String caractere;

		System.out.println("informe o resultado dos jogos \n V: vitoria \n P: perdeu");

		for (int i = 0; i < 6; i++) {
			caractere = ler.nextLine().toLowerCase();

			if (caractere.startsWith("v")) {
				contador++;
			}

		}
		if (contador >= 5) {
			contador = 1;
		} else if (contador >= 3) {
			contador = 2;
		} else if (contador >= 1) {
			contador = 3;
		} else {
			contador = -1;
		}
		System.out.println(contador);
		ler.close();

	}

	public static void Ex6() {

		Scanner ler = new Scanner(System.in);

		int qtd = 0, contador = 0;
		String frase = "", situacao = " ";
		char letra;
		while (qtd <= 3 || qtd >= 280) {

			System.out.println("informe a frase:");
			frase = ler.nextLine();

			qtd = frase.length();

			if (qtd <= 3 || qtd >= 280) {
				System.out.println("quantidade de caractere invalido");
			}

		}
		for (int i = 0; i < qtd; i++) {
			letra = frase.charAt(i);
			if (letra == ')') {
				contador++;
			} else if (letra == '(') {
				contador--;
			}

		}
		if (contador >= 1) {
			situacao = "divertido";
		} else if (contador <= -1) {
			situacao = "chateado";
		} else {
			situacao = "neutro";
		}
		System.out.println(situacao);
		ler.close();

	}
}
