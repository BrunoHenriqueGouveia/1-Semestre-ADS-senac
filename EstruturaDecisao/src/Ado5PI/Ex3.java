package Ado5PI;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			
			System.out.print( "Informe sua 1° nota:");
			double nota1 = ler.nextDouble();
			
			System.out.print( "Informe sua 2° nota:");
			double nota2 = ler.nextDouble();
			
			System.out.print( "Informe sua 3° nota:");
			double nota3 = ler.nextDouble();
			
			System.out.print( "Informe quantidade de faltas:");
			double faltas = ler.nextDouble();
            
			double media = (nota1+nota2+nota3) / 3;
			String situacao= "";
			
			if (media >= 8 && faltas <= 30) {
				situacao = "Aprovado com sucesso";
			}
			else if (media >= 6 && faltas <= 30) {
				situacao = "Aprovado";
			}
			else if (media >= 3 && faltas <= 30) {
				situacao = "Recuperação";
			}
			else if (media >= 8 || faltas > 30) {
				situacao = "Reprovado";
			}
			else {
				situacao = "Desistente";
			}
			
			System.out.println("Situação do aluno: "+situacao);
			ler.close();
	}

}
