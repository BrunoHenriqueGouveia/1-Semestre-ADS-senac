package ADO6PI;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe altura do triângulo:");
		int altura = ler.nextInt();
		int linha = 1;
		int coluna = 1;
		while (linha <= altura) {
			while (coluna <= linha) {
				System.out.print(" * ");
				coluna++;
			}
			coluna = 1;
			linha++;
			System.out.println();

		}
		ler.close();

	}

}
