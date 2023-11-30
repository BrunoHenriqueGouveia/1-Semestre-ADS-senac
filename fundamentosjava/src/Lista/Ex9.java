package Lista;

import java.util.Scanner;

public class Ex9 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Informe o cateto oposto do triângulo:");
		double cO = ler.nextDouble();

		System.out.println("Informe o cateto adjacente do triângulo:");
		double cA = ler.nextDouble();

		double resultado = Math.sqrt((Math.pow(cO, 2) + Math.pow(cA, 2)));

		System.out.printf("O valor da hipotenusa é:%.2f", resultado);

	}
}
