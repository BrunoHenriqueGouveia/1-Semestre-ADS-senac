package ADO6PI;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("informe um numero de fim");
		int fim = ler.nextInt();

		System.out.println("informe um numero de inicio");
		int inicio = ler.nextInt();

		while (fim >= inicio) {
			System.out.println(fim);
			fim--;
		}
		ler.close();

	}

}
