package Lista;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Digite o valor do seu salario: ");
		double salario = ler.nextDouble();

		System.out.print("Digite o valor da primeira conta atrasada: ");
		double conta1 = ler.nextDouble();

		System.out.print("Digite o valor da segunda conta atrasada: ");
		double conta2 = ler.nextDouble();

		double valor1 = ((2 * conta1) / 100) + conta1;
		double valor2 = ((3.5 * conta2) / 100) + conta2;
		double restoSalario = salario - valor1 - valor2;

		System.out.printf("Depois de paga as conta sobrara:R$%.2f", restoSalario);

	}
}
