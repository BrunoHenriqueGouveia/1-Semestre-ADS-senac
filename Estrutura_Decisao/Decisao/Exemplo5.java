package Decisao;

import java.util.Scanner;

public class Exemplo5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("informe 3 numeros");
		int num1 = ler.nextInt();
		int num2 = ler.nextInt();
		int num3 = ler.nextInt();

		String resultado = "";

		if (num1 == num2 || num1 == num3 || num2 == num3) {
			resultado = "Não pode ter numeros iguais, \n Informe outros 3 numeros:";
		} 
		else {

			if (num1 < num2 && num1 < num3) {
				resultado = "numero menor é" + num1;
			}

			else if (num2 < num1 && num2 < num3) {
				resultado = "numero menor é" + num2;
			} else if (num3 < num2 && num3 < num1) {
				resultado = "numero menor é " + num3;
			}
		}

		System.out.println(resultado);
		
		
		

	}

}
