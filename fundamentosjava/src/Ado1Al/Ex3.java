package Lista;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("ola, informe seu salario bruto:");
		double salario = ler.nextDouble();

		double salariobruto = (10 * salario) / 100 + salario;
		double desconto = (15 * salariobruto) / 100;
		double salarioliquido = salariobruto - desconto;

		System.out.printf("O seu salario liquido é de %.2f", salarioliquido);

	}

}
