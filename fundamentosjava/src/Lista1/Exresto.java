package Lista1;

import java.util.Scanner;

public class Exresto {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		//Faça um programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-vespertino ou N-noturno. Imprima a mensagem “Bom dia!” ou  “Boa Noite” ou “Valor inválido”, conforme o caso. 
		System.out.println("Em que turno voçe estuda \n M: matutino \n V: vespertino \n N: noturno");
		String turno = ler.nextLine().toUpperCase();
		
	    String bomdia;
		if (turno.equals("M") || turno.equals("V")) {
			bomdia = "Bom dia aluno";
		}
		else if(turno.equals("N")) {
			bomdia = "Boa noite aluno";
		}
		else {
			bomdia = "Não consigo intendificar";
		}
		System.out.println(bomdia);
		
		
		
	
		
		
		
		
		
		
		
	}

}
