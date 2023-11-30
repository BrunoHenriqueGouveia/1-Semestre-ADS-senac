package Ado8PI;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("informe um numero:");
		int num = ler.nextInt();

		String[] dia = { "Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira",
				"Sabado" };

		System.out.println("dia da semana: " + dia[num]);
        ler.close();
	}

}
