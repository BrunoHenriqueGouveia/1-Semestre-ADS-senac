package Decisao;

import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("INFORME AS NOTAS");
		int nota1 = ler.nextInt();
		int nota2 = ler.nextInt();

		int media = (nota1 + nota2) / 2;

		String aprovado = " ";

		if (media < 0 || media > 100) {
			System.err.println("Media invalida");
		}

		else {

			if (media > 80 ) {
				aprovado = "Parabens , voçe esta excelente";
			}

			else if (media > 60) {
				aprovado = "parabens voçe esta acima da media ";
			}

			else if (media > 50) {
				aprovado = "parabens voçe esta na media ";
			}

			else if (media > 30 ) {
				aprovado = "Voçe esta de recuperação ";
			} else {
				aprovado = "VOÇE ESTA REPROVADO";
			}

		}
		System.out.println("A sua media é "+ media);
		System.out.println( aprovado);
        
	}

}
