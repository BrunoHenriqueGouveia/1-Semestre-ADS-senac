package Ado8PI;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		

		System.out.println("informe um numero:");
		int num = ler.nextInt();

		String[] mes = { "janeiro", "fevereiro", "março", "abril", "maio", "junho",
				"julho","agosto","setembro","outubro","novembro","dezembro" };

		System.out.println("Mês: " + mes[num]);
        ler.close();

	}

}
