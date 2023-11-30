package Decisao;

import java.util.Scanner;

public class Exemplo4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe sua turma");
		String turma = ler.nextLine().toUpperCase();

		if(turma.equals("B")) {
			System.out.println("voçe é da turma B");
		}
		else {
			System.err.println("Voçe não é da turma B");
		}
		
	  
	}

}
