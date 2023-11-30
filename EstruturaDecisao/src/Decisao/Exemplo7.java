package Decisao;

import java.util.Scanner;

public class Exemplo7 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.print("Informe um numero:");
		int num = ler.nextInt();
		
		String verdade;
		if (num > 100 ) {
			verdade = "O numero esta fora da faixa";
		}
		
		else {
			verdade = "o numero informado se encaixa";
		}
		
		System.out.println(verdade);
		
		
		
		

	}

}
