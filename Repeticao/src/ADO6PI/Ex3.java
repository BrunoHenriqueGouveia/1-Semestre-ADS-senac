package ADO6PI;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("informe um numero de inicio:");
		int inicio = ler.nextInt();

		System.out.println("informe um numero de fim:");
		int fim = ler.nextInt();

		while (inicio <= fim) {
			System.out.println(inicio);
			inicio++;
		}
		ler.close();

	}

}
