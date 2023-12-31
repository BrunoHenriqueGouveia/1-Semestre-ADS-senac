package Exemplos;

import java.util.Random;
import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Random aleatorio = new Random();

		// exercio11 prova
		/*
		 * int[] posicoes10 = new int[10]; int[] posicoes20 = new int[20]; int contador
		 * = 0; for (int i = 0; i < posicoes10.length; i++) {
		 * System.out.println("informe os valores do vetor"); posicoes10[i] =
		 * ler.nextInt(); posicoes20[contador] = posicoes10[i]; contador++;
		 * posicoes20[contador] = posicoes10[i] * 2; contador++; }
		 * 
		 * for (int i : posicoes10) { System.out.print(i + "|"); } System.out.println();
		 * for (int i : posicoes20) { System.out.print(i + "|"); }
		 */

		int[] posicoes50 = new int[50];

		for (int i = 0; i < posicoes50.length; i++) {
			posicoes50[i] = aleatorio.nextInt(50);
		}

		for (int i : posicoes50) {
			System.out.print(i + "  |");
		}
		System.out.println();
		for (int i : vetorUnivalorNaoRepitidos(posicoes50)) {
			System.out.print(i + "  |");
		}

	}

	public static void bidimensao() {
		Random aleatorio = new Random();

		int[][] bidimensao = new int[5][4];

		for (int i = 0; i < bidimensao.length; i++) {
			for (int j = 0; j < bidimensao[i].length; j++) {
				bidimensao[i][j] = aleatorio.nextInt(101);
			}
		}
		// exibir arrays no for normal
		for (int i = 0; i < bidimensao.length; i++) {
			System.out.print("[");
			for (int j = 0; j < bidimensao[i].length; j++) {
				System.out.printf(" %03d ", bidimensao[i][j]);
			}
			System.out.print("]");
			System.out.println();
		}
		System.out.println();
		// exibir arrays no for ech
		for (int[] i : bidimensao) {
			System.out.print("[");
			for (int j : i) {
				System.out.printf("%03d ", j);
			}
			System.out.println("]");
		}
	}

	public static void tridimensao() {
		Random aleatorio = new Random();

		int[][][] tridimensao = new int[5][4][4];

		for (int i = 0; i < tridimensao.length; i++) {

			for (int j = 0; j < tridimensao[i].length; j++) {

				for (int k = 0; k < tridimensao[i][j].length; k++) {
					tridimensao[i][j][k] = aleatorio.nextInt(101);
				}

			}
		}

		// exibir for normal
		for (int i = 0; i < tridimensao.length; i++) {

			for (int j = 0; j < tridimensao[i].length; j++) {

				System.out.print("[");

				for (int k = 0; k < tridimensao[i][j].length; k++) {
					System.out.printf("%03d ", tridimensao[i][j][k]);

				}

				System.out.println("]");
			}
			System.out.println();
		}
		System.out.println();

		// exibir com for each
		for (int[][] i : tridimensao) {

			for (int[] j : i) {
				System.out.print("[");

				for (int k : j) {
					System.out.printf("%03d ", k);
				}

				System.out.print("]");
			}

			System.out.println();
		}

	}

	public static boolean verificar(int valor, int[] vetor) {
		boolean situacao = false;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == valor) {
				situacao = true;
				break;
			}
		}
		return situacao;
	}

	public static int[] vetorInt(int tamanho) {
		Random aleatorio = new Random();

		int[] vetor = new int[tamanho];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = aleatorio.nextInt(50);
		}
		return vetor;

	}

	public static int[] vetorValorNaorepitidos(int[] vetor) {
		Random aleatorio = new Random();

		for (int i = 0; i < vetorInt(vetor.length).length; i++) {
			int valorAleat;
			do {
				valorAleat = aleatorio.nextInt(100);
			} while (verificar(valorAleat, vetorInt(10)));
			vetor[i] = valorAleat;

		}
		return vetor;

	}

	public static int[] encontrarCordenadaArrayBi(int valor, int[][] vetor) {
		int[] cordenadas = new int[2];

		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor[i].length; j++) {
				if (vetor[i][j] == valor) {
					cordenadas[0] = i;
					cordenadas[1] = j;
				}
			}
		}
		return cordenadas;

	}

	public static boolean ehPrimo(int numero) {

		boolean primo = false;

		if (numero % 2 == 1) {
			primo = true;
		}

		return primo;
	}

	public static int[][][] arraystriNumPar(int linha, int coluna, int qtd) {
		Random aleatorio = new Random();
		int[][][] tri = new int[linha][coluna][qtd];
		int valor = 0;
		for (int i = 0; i < tri.length; i++) {
			for (int j = 0; j < tri[i].length; j++) {
				for (int k = 0; k < tri[i][j].length; k++) {
					do {
						valor = aleatorio.nextInt(100);
					} while (valor % 2 == 1);
					tri[i][j][k] = valor;
				}

			}
		}
		return tri;

	}

	public static int[] vetorUnivalorNaoRepitidos(int[] vetor) {

		for (int i = 0; i < vetor.length; i++) {
			for (int j = i + 1; j < vetor.length; j++) {
				if (vetor[i] == vetor[j]) {
					vetor[j] = 0;
				}
			}
		}

		return vetor;

	}

}
