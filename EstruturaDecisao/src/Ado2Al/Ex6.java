package Lista2;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
	System.out.println("|==========MENU DE OPÇÕES==========|");	
	System.out.println("|1: Somar dois numeros             |");	
	System.out.println("|2: Raiz quadrada de um número     |");	
	System.out.println("|3: Elevar um numero a uma potância|");	
	System.out.println("|========Informe uma opção:========|");		
	int opcao = ler.nextInt();
	
	if (opcao == 1) {
		System.out.print("Informe o 1° numero:");
		double num1 = ler.nextDouble();
		System.out.print("Informe o 2° numero:");
		double num2 = ler.nextDouble();
		double soma = num1 + num2;
		System.out.printf("A soma de %.0f + %.0f= %.0f",num1,num2,soma);
	}
	else if (opcao == 2) {
		System.out.print("Informe o numero:");
		double num = ler.nextDouble();
		double raiz = Math.sqrt(num);
		System.out.printf("A raiz %.0f é:%.1f",num,raiz);
	}
	else {
		System.out.println("Informe o numero:");
		double num =ler.nextDouble();
		System.out.println("Informe a potência");
		double potencia = ler.nextDouble();
		double elevar = Math.pow(num, potencia);
		System.out.printf("O numero %.0f elevado a potência %.0f é:%.0f",num,potencia,elevar);
		
	}
	
	
	
		
		

	}

}
