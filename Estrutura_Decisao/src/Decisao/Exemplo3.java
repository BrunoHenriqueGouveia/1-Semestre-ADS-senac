package Decisao;

import java.util.Scanner;

public class Exemplo3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("INFORME AS NOTAS");
		int nota1 = ler.nextInt();
		int nota2 = ler.nextInt();

		int media = (nota1 + nota2) / 2;

		
	  System.out.println(media >= 50? "APROVADO":"REPROVADO");
		
		

	}
}
