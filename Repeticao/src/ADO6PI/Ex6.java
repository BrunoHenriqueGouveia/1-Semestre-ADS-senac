package ADO6PI;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite quantidade: ");
		int quantidade = ler.nextInt();
		int linha = 1;

		while (linha <= quantidade) {
			System.out.print("*");
			linha++;
		}
		ler.close();

	}

}
