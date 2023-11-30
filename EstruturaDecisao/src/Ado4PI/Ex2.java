package Ado4PI;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("informe a cor do semáforo:");
		String cor = ler.nextLine();
		String semaforo = "";

		if (cor.equalsIgnoreCase("verde")) {
			semaforo = "Pode atravessar";
		} else if (cor.equalsIgnoreCase("vermelho")) {
			semaforo = "Espere ficar verde para atravessar";
		} else {
			semaforo = "Farol inoperante";
		}
		System.out.println(semaforo);

	}

}
