package ADO6PI;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("informe um numero:");
		int voltas = ler.nextInt();
		int num = 1;

		while (voltas >= num) {
			System.out.println(voltas);
			voltas--;

		}
		ler.close();

	}

}
