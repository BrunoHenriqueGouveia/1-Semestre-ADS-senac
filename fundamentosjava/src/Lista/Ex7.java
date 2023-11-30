package Lista;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Ola,informe quantos kg tem o saco de ração:");
		double kg = ler.nextDouble() * 1000;

		System.out.println("Ola,informe quantas gramas cada gato come por dia:");
		double gramaspordia = ler.nextDouble() * 2;

		double sobrou = kg - (gramaspordia * 5);

		System.out.printf("Depois de 5 dias restará %.0fg de ração para os gatos", sobrou);

	}

}
