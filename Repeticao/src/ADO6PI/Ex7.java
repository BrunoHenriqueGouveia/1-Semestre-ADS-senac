package ADO6PI;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite quantidade: ");
		int quantidade = ler.nextInt();
		int linha = 1;
		int contador = 1;
		while (linha <= quantidade) {
			while (contador <= quantidade) {
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
