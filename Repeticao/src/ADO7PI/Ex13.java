package ADO7PI;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe a posição desejada na sequencia de fibonacci:");
		int num = ler.nextInt();

		int a = 1;
		int b = 0;
		int c = 0;

		for (int i = 0; i < num; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		System.out.printf("O valor na posição %d da sequência de Fibonacci é %d", num, c);
		ler.close();

	}

}
