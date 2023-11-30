package Decisao;

import java.util.Scanner;

public class Exemplo8 {

	public static void main(String[] args) {
	   Scanner ler = new Scanner(System.in);
	   
	   System.out.println("Informe 3 numeros:");
	   int num1 = ler.nextInt();
	   int num2 = ler.nextInt();
	   int num3 = ler.nextInt();
	   
	   if ((num3 > num1 && num3 > num2) || (num3>num2 && num3<num1)|| (num3 > num1 && num3 < num2)) {
		   
		   System.out.println("O numero 3° esta entre os dois primeiros");
	   }
	  
	   else {
		   System.err.println("O numero 3/ nao esta entre os dois primeiros");
	   }
	   
	   
   
		
	}

}
