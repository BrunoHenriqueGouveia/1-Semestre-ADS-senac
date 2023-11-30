package Ado8PI;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("informe a quantidade de ingresso:");
		int quantidade = ler.nextInt();
		System.out.println("informe a sigla do ingresso:");
		String sigla = ler.next();

		String[] codigo = new String[quantidade];
		int num = 1;
		for (int contador = 0; contador < quantidade; contador++) {
			codigo[contador] = sigla + "__" + num;
			num++;
		}
		for (String contador : codigo) {
			System.out.println(contador);
		}
		ler.close();

	}
}
