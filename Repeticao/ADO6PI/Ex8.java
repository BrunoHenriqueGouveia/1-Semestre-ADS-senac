package ADO6PI;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("informe altura do retangulo");
		int altura = ler.nextInt();
		System.out.println("informe base do retangulo");
		int base = ler.nextInt();

		int contador = 1;
		int linha = 1;
		while (linha <= altura) {
			while (contador <= base) {
				System.out.print("*");
				contador++;
			}
			contador = 1;
			linha++;
			System.out.println();
		}

		ler.close();
	}

}
