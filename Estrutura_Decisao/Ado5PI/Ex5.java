package Ado5PI;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("informe a nota:");
		double nota = ler.nextDouble();

		System.out.println("informe a nota de corte:");
		double notaCorte = ler.nextDouble();

		System.out.println("informe a nota mínima para aprovação:");
		double notaAprovacao = ler.nextDouble();

		String situacao="";
		if (nota < notaCorte) {
			situacao = "Candidato não passou";
		} else if (nota >= notaAprovacao) {
			situacao = "Candidato aprovado";
		} else {
			situacao = "Candidato está na lista de espera";
		}
		System.out.println(situacao);
		ler.close();

	}

}
