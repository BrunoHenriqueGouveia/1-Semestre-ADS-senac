package Lista;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("informe a 1º nota e seu peso:");
		double n1 = ler.nextDouble();
		double p1 = ler.nextDouble();

		System.out.println("informe a 2º nota e seu peso:");
		double n2 = ler.nextDouble();
		double p2 = ler.nextDouble();

		System.out.println("informe a 3º nota e seu peso:");
		double n3 = ler.nextDouble();
		double p3 = ler.nextDouble();

		double media = (n1 * p1 + n2 * p2 + n3 * p3) / (p1 + p2 + p3);

		System.out.printf("A media ponderada é: %.1f", media);

	}

}
