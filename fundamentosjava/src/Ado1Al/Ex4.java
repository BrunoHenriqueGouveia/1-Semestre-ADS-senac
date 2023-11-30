package Lista;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Informe o raio do circulo:");
		double raio = ler.nextDouble();

		double area = Math.PI * Math.pow(raio, 2);
		double perimetro = 2 * Math.PI * raio;

		System.out.printf(" A area do circulo é:%.2f %n", area);

		System.out.printf("O perimetro do circulo é:%.2f %n", perimetro);

	}

}
