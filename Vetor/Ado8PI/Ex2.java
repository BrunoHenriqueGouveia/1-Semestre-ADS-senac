package Ado8PI;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("informe 5 nomes aleatorios:");
		String nome1 = ler.nextLine();
		String nome2 = ler.nextLine();
		String nome3 = ler.nextLine();
		String nome4 = ler.nextLine();
		String nome5 = ler.nextLine();

		String[] nomes = new String[] { nome1, nome2, nome3, nome4, nome5 };

		System.out.println("os nome que voçe digitou");
		for (String contador : nomes) {
			System.out.println(contador);
		}

		ler.close();

	}

}
