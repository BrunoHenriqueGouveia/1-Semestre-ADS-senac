package Exemplos;

import java.util.Scanner;

public class Exemplo1 {
	static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {
		escrever("programa media");
		double nota1 = pedirnota("informe a primeira nota");
		double nota2 = pedirnota("informe a segunda nota");
		double nota3 = pedirnota("informe a terceira nota");
		
		double media = media(nota1, nota2, nota3);
		
		escrever("a sua media é: "+ media);
        escrever("O aluno esta: " + aprovado(media));
	}

	public static void escrever(String msg) {
		System.out.println(msg);
	}

	public static double pedirnota(String msg) {
		escrever(msg);
		double nota1 = ler.nextDouble();
		return nota1;
	}

	public static double media(double nota1, double nota2, double nota3) {
		return (nota1 + nota2 + nota3) / 3;
	}

	public static String aprovado(double media) {
		String aprovado = "";
		if (media >= 6) {
            
			aprovado = "aprovado";
		} else {

			aprovado = "reprovado";

		}
		return aprovado;

	}

}
