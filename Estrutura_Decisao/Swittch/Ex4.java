package Swittch;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("informe o codigo do produto");
		int codigoProduto = ler.nextInt();
		
		System.out.println("informe o peso do produto em quilos");
		double peso = ler.nextDouble()*1000;
		
		System.out.println("informe o codigo do país:");
		int codigoPais = ler.nextInt();
		
		double imposto = 0;
		double valorGramas = 0;
		
		switch (codigoPais) {
		case 1: imposto = 0;
		break;
		case 2: imposto = 15;
		break;
		default: imposto = 25;
		break;
		}
		
		switch (codigoProduto) {
		case 1,2,3,4 ->{
			valorGramas = 10;
		}
		case 5,6,7->{
			valorGramas = 25;
		}
		case 8,9,10 ->{
			valorGramas = 35;
		}
		
		}
		
		double precoproduto = (valorGramas / peso) * 100;
		double valorImposto = (precoproduto*imposto) / 100;
		double valorTotal = precoproduto + valorImposto;
		
		System.out.printf("peso do produto: %.2fg %n",peso);
		System.out.printf("preço do produto: %.2f %n",precoproduto);
		System.out.printf("valor do imposto: %.2f %n",valorImposto);
		System.out.printf("valor total: %.2f %n",valorTotal);
		
		ler.close();
		
	}

}
