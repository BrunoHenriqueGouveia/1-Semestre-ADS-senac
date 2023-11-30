package ADO7PI;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("informe uma frase:");
		String frase = ler.nextLine();
		String resultado = " ";
		
		for (int contador = 0; contador < frase.length(); contador++) {
			char letra = frase.charAt(contador);
			resultado = letra + resultado;
		}
		System.out.println(resultado);
		ler.close();

	}

}
