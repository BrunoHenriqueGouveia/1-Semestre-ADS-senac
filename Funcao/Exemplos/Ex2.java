package Exemplos;

import java.util.Scanner;

public class Ex2 {
	static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {

		int tamanho = pedirint("informe a quantidade");
		escrever("informe as notas:");
		double[]numeros =numeros(tamanho);
		double media = media(numeros);
		escrever("A media é: " + media);
		escrever("Situação:" + verificarSituacao(media));

	}

	public static void escrever(String msg) {
		System.out.println(msg);
	}

	public static String verificarSituacao(double media) {
		String situacao = "";
		if (media >= 6) {
			situacao = "aprovado";
		} else {
			situacao = "reprovado";
		}
		return situacao;
	}

	public static double[] numeros (int tamanho) {
		double[] numeros = new double[tamanho];
		for (int i = 0; i < tamanho; i++) {
			numeros[i] = ler.nextDouble();
			
		}
		return numeros;
	
	}
	public static double media(double numeros[]) {
		double media = 0;
		for(double i : numeros) {
			media = media + i;		
		}
		media = media / numeros.length;
		return media;
	}
	public static int pedirint(String msg) {
		System.out.println(msg);
		int num = ler.nextInt();
		return num;
	}
	
	

}
