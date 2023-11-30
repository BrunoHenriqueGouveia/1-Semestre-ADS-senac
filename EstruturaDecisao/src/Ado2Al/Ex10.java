package Lista2;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe sua 1° nota:");
		int nota1 = ler.nextInt();

		System.out.println("Informe sua 2° nota:");
		int nota2 = ler.nextInt();

		System.out.println("Informe sua 3° nota:");
		int nota3 = ler.nextInt();

		System.out.println("Informe sua 4° nota:");
		int nota4 = ler.nextInt();

		System.out.println("Informe a quantidade de aulas realizadas pelo professor :");
		int aulasDadas = ler.nextInt();

		System.out.println("Informe quantidade de presença do aluno:");
		int presenca = ler.nextInt();

		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		double mediaFaltas = (presenca * 100) / aulasDadas;

		String premio ="";
		
		if (media < 0 && media > 100) {
			System.err.println("Media invalida \n notas entre 0 e 100");
		}

		else {
			if (media > 80 && mediaFaltas == 100) {
				premio = "Parabens,voçe ganhou uma EXCURSÃO";
			}

			else if (media >= 80 || mediaFaltas == 100) {
				premio = "Parabens,voçe ganhou uma CAMISETA";
			} else if (media >= 70 && media <= 80 && mediaFaltas >= 90) {
				premio = "Parabens,voçe ganhou uma SQUEEZE";
			} else if (media >= 70 && media <= 80 || mediaFaltas >= 90) {
				premio = "Parabens,voçe ganhou uma CANETA PERSONALIZADA";
			}else {
				premio ="ME DESCULPE , não a premios para voçe ";
			}

		}

		System.out.println(premio);
		
		  
	}

}
