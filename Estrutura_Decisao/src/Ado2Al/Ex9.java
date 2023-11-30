package Lista2;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("informe sua 1° nota:");
		double nota1 = ler.nextDouble();

		System.out.print("informe sua 1° nota:");
		double nota2 = ler.nextDouble();

		System.out.print("informe sua 1° nota:");
		double nota3 = ler.nextDouble();

		double media = (nota1 + nota2 + nota3) / 3;

		if (media >= 6) {
			System.out.println("VOÇE ESTA APROVADO \n PARABENS");
		} else if (media < 5) {
			System.out.println("ALUNO REPROVADO \n DEU RUIM");
		} else {

			System.out.print("VOÇE ESTA DE RECUPERAÇÃO \nInforme sua nota da atividade de recuperação: ");
			double recuperacao = ler.nextDouble();
			double mediaRecuperacao = (media + recuperacao) / 2;

			if (mediaRecuperacao >= 6) {
				System.out.println("Parabens , voçe esta aprovado por recuperaçao");
			} else {
				System.out.println("Voçe esta reprovado");
			}
		}

	}

}
