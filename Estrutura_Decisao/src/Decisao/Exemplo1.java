package Decisao;

import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("INFORME AS NOTAS");
		int nota1 = ler.nextInt();
		int nota2 = ler.nextInt();

		int media = (nota1 + nota2) / 2;

		if (media >= 50) {
			System.out.println("Parabens, voçe esta aprovado");
		} else {
			System.out.println("Aluno reprovado");
		}

	}

}
