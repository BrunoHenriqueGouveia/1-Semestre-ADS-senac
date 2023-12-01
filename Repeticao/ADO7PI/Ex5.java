package ADO7PI;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("informe o numero que vai ser multiplo:");
		int multiplo = ler.nextInt();

		System.out.println("informe o numero de inicio");
		int inicio = ler.nextInt();

		System.out.println("informe o numero de fim");
		int fim = ler.nextInt();
		int resultado = 0;

		for (int contador = inicio; contador <= fim; contador++) {
			if (contador % multiplo == 0) {
				resultado = resultado + contador;
			}
		}
		System.out.printf("A soma dos números múltiplos de %d, de %d á %d é %d", multiplo, inicio, fim, resultado);
		ler.close();

	}

}
