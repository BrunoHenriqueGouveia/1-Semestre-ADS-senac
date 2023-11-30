package ProvaAl;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double conta = 0;
		int num;
		
		System.out.println("ola, informe um numero :");
		num = ler.nextInt();

		System.out.println("O numero informado é ?");

		if (num % 2 == 0) {
			System.out.println(" PAR . \n digite o seu nome:");
			String nome = ler.next();

		} else {
			System.out.println("IMPAR");
		}
		System.out.println("previsão se vai chover ");
		System.out.println("Vai chover? sim ou não:");
		String previsao = ler.next();

		boolean chuva = previsao.equalsIgnoreCase("sim");

		if (chuva) {
			System.out.println("levar guarda chuva");
			conta = 2 * num;
		}

		System.out.printf("A multiplicação de 2 x %d é: %n", num);
		System.out.println(conta);
		ler.close();

	}

}
