package ADO6PI;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite um numero de inicio");
		int inicio = ler.nextInt();
		System.out.println("Digite um numero que acaba");
		int fim = ler.nextInt();

		while (inicio <= fim) {
			if (inicio % 2 == 0) {
				System.out.println(inicio);
			}
			inicio++;
		}
		ler.close();
	}

}
