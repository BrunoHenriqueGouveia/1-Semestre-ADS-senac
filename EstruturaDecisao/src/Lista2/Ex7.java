package Lista2;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe a hora de inicio:");
		int horaInicio = ler.nextInt();
		System.out.println("Informe os minutos de inicio:");
		int minutosInicio = ler.nextInt();

		System.out.println("Informe a hora do terminio:");
		int horaTerminio = ler.nextInt();
		System.out.println("Informe os minutos do terminio:");
		int minutosTerminio = ler.nextInt();

		if (horaInicio < horaTerminio) {
			int duracaohoras = horaTerminio - horaInicio;
			int duracaominutos = minutosTerminio - minutosInicio;

			System.out.printf("o total de horas jogadas é de %d horas e %d minutos", duracaohoras, duracaominutos);
		}

		else if (horaInicio > horaTerminio) {

			int duracaohoras = (24 - horaInicio) + horaTerminio;
			int duracaominutos = (60 - minutosInicio) + minutosTerminio;

			System.out.printf("o total de horas jogadas é de %d horas e %d minutos", duracaohoras, duracaominutos);

		}

		else if (horaInicio == horaTerminio && minutosInicio == minutosTerminio) {
			System.out.println("o total jogado foi de 24 horas");
		}

		else if (horaInicio == horaTerminio && minutosInicio > minutosTerminio) {
			int duracaohoras = (23 - horaInicio) + horaTerminio;
			int duracaominutos = (60 - minutosInicio) + minutosTerminio;

			System.out.printf("o total de horas jogadas é de %d horas e %d minutos", duracaohoras, duracaominutos);

		}

		else {
			System.err.println("invalido");
		}

	}

}
