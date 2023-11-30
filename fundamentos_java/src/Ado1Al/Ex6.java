package Lista;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe os valores de A ,B e C:");
		double a = ler.nextDouble();
		double b = ler.nextDouble();
		double c = ler.nextDouble();

		double delta = Math.pow((b), 2) - (4 * a * c);
		double x1 = (-(b) + Math.sqrt(delta)) / (2 * (a));
		double x2 = (-(b) - Math.sqrt(delta)) / (2 * a);

		System.out.printf("O valor da equação de 2º grau é:%n x1: %.1f , x2: %.1f", x1, x2);

	}

}
