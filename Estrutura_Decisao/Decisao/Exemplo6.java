package Decisao;

import java.util.Scanner;

public class Exemplo6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe seu nome");
		String nome = ler.nextLine();
		
		System.out.print("Informe sua 1° nota:");
        double nota1 = ler.nextDouble();
        
        System.out.print("Informe sua 2° nota:");
        double nota2 = ler.nextDouble();
		
        System.out.print("Informe sua 3° nota:");
        double nota3 = ler.nextDouble();
		
        System.out.print("Informe sua 4° nota:");
        double nota4 = ler.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4) /4;
		String classif; 
		
		if (media <= 20) {
			classif = "PÉSSIMO";
		}
		
		else if (media > 20 && media <=40) {
			classif = "RUIM";
		}
		
		else if (media > 40 && media <=60) {
			classif = "REGULAR";
		}
		
		
		else if (media > 60 && media <=80) {
			classif = "BOM";
		}
		
		else if (media > 80 && media<= 100) {
			classif = "OTIMO";
		}
		
		else {
			classif = "ESSA NOTA É INVALIDA";
		}
		

		System.out.printf("%s suas notas são %n nota 1° %.1f %n nota 2° %.1f %n nota 3° %.1f %n nota 4° %.1f %n MEDIA: %.1f %n Classificação: %s",nome , nota1 , nota2,nota3,nota4,media,classif);
		
		
		
	}

}
