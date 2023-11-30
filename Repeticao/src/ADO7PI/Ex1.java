package ADO7PI;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("informe um numero:");
		int num = ler.nextInt();
		int soma = 0;

		for (int contador = 1; contador <= num; contador++) {
			soma = soma + contador;
		}
		System.out.printf("A soma dos numeros naturais de 1 Ate %d = %d ", num, soma);
		ler.close();

	}

}
