package Lista;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double delta = Math.pow((-5), 2) - (4 * 1 * 6);
		double x1 = (-(-5) + Math.sqrt(delta)) / (2 * 1);
		double x2 = (-(-5) - Math.sqrt(delta)) / (2 * 1);

		System.out.printf("O valor da equação x2 - 5x + 6 = 0 é: %n x1: %.1f %n x2: %.1f", x1, x2);

	}

}
