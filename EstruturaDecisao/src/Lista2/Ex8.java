package Lista2;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Informe um ano:");
		int ano = ler.nextInt();

		int bissexto = ano % 4;

		if (ano % 400 == 0) {
			System.out.printf("O ano %d é um ano bissexto", ano);
		} else if (bissexto == 0)
		{
			System.out.printf("O ano %d é um ano bissexto", ano);
		}
		else if (bissexto == 1) {
			int conta = ano + 3;
			System.out.printf("O ano informado não é bissexto o proximo ano bissexto é: %d", conta);
		}

		else if (bissexto == 2) {
			int conta = ano + 2;
			System.out.printf("O ano informado não é bissexto o proximo ano bissexto é: %d", conta);
		} else {
			int conta = ano + 1;
			System.out.printf("O ano informado não é bissexto o proximo ano bissexto é: %d", conta);
		}

	}

}
