package Ado5PI;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o total de ganhos da familia");
		double ganhos = ler.nextDouble();

		System.out.println("Digite o total de gastos da famila");
		double gastos = ler.nextDouble();

		double porcentagem = (gastos / ganhos) * 100;

		String situacao = "";

		if (gastos > ganhos) {
			situacao = "Orçamento comprometido,hora de rever seus gastos!!!";
		} else {
			if (porcentagem >= 81) {
				situacao = "Cuidado,seu orçamento pode ficar comprometido ";
			} else if (porcentagem >= 51) {
				situacao = "Atençao,melhor conter os gastos!";
			} else if (porcentagem >= 21) {
				situacao = "Muito bem, seus gastos não ultrapassam metade dos ganhos";
			} else {
				situacao = "Parabens, está gerenciando bem seu orçamento";
			}
		}

		System.out.println(situacao);
		ler.close();

	}

}
