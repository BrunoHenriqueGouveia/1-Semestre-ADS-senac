package ADO6PI;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe altura do triângulo:");
		int altura = ler.nextInt();
		int linha = 1;
		int coluna = 1;
		int num = 1;

		while (linha <= altura) {
			int espaco = altura - linha;
			while (num <= espaco) {
				System.out.print(" ");
				num++;
			}
			while (coluna <= linha) {
				System.out.print("*");
				coluna++;
			}
			num = 1;
			coluna = 1;
			linha++;
			System.out.println();

		}
		ler.close();

	}

}
