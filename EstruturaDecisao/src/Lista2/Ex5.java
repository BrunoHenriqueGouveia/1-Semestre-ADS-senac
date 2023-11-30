package Lista2;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe os valores de: X,Y e Z");
		double x = ler.nextDouble();
		double y = ler.nextDouble();
		double z = ler.nextDouble();

		String triangulo;
		if ((x > y + z) || (y > x + z) || (z > x + y)) {

			triangulo = "INVALIDO\n O comprimento de cada lado de um triângulo é menor do que a soma dos outros dois lados";

		} else if (x == y && x == z) {
			triangulo = "Chama-se equilátero o triângulo que tem três lados iguais";

		}

		else if (x == y || x == z || z == y) {
			triangulo = "Chama-se isósceles o triângulo que tem o comprimento de dois lados iguais";
		}

		else {
			triangulo = "Recebe o nome de escaleno o triângulo que tem os três lados diferentes";
		}

		System.out.println(triangulo);

	}

}
