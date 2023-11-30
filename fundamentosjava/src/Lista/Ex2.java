package Lista;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("informe seu nome:");
		String nome = ler.nextLine();

		System.out.println("informe seu salario:");
		double salario = ler.nextDouble();

		double aumento = (25 * salario) / 100;
		double salarioNovo = aumento + salario;

		System.out.printf("%s voçe recebera um aumento de %.2f o seu salario agora é de %.2f.", nome, aumento,
				salarioNovo);

	}

}
