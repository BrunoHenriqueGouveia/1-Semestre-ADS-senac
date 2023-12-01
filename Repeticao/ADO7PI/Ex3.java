package ADO7PI;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("informe um numero");
		int num = ler.nextInt();
		int soma = 0;
		for (int contador = 1; contador <= num; contador++) {
			if (contador % 2 == 0) {
				soma = soma + contador;
			}
		}

		System.out.printf("A soma dos numeros pares de 1 ate %d é %d", num, soma);
		ler.close();

	}

}
