package ADO7PI;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("informe um numero:");
		int num = ler.nextInt();
		int fatoracao;
		double resultado = 1;

		for (fatoracao = 1; fatoracao <= num; fatoracao++) {
			resultado = resultado * fatoracao;

		}
		System.out.println("A fatoração de " + num + " é " + resultado);
		ler.close();

	}

}
