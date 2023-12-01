package ADO6PI;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o numero da tabuada: ");
		int tabuada = ler.nextInt();

		int numero = 1;

		while (numero <= 10) {
			int resultado = tabuada * numero;
			System.out.println(tabuada + " x " + numero + " = " + resultado);
			numero++;
		}
		ler.close();

	}

}
