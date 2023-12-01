package Lista;

import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("informe uma medida em pés:");
		double pes = ler.nextDouble();

		double polegadas = pes * 12;
		double jardas = pes / 3;
		double milha = pes / 5.280;

		System.out.println("Conversões:");
		System.out.printf("Polegadas:%.0f %n", polegadas);
		System.out.printf("jardas:%f %n", jardas);
		System.out.printf("milhas:%f %n", milha);

	}

}
