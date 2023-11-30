package ProvaAl;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe o nome do shopping");
		String shopping = ler.nextLine();
		System.out.println("Informe a placa do veiculo");
		String placa = ler.nextLine();
		System.out.println("Informe a hora de entrada do veiculo:");
		System.out.print("horas: ");
		int horaEntrada = ler.nextInt();
		System.out.print("minutos: ");
		int minutosEntrada = ler.nextInt();

		System.out.println("Informe a hora de saida do veiculo:");
		System.out.print("horas: ");
		int horaSaida = ler.nextInt();
		System.out.print("minutos: ");
		int minutosSaida = ler.nextInt();

		int duracaoHoras = horaSaida - horaEntrada;
		;
		int duracaoMinutos = minutosSaida - minutosEntrada;
		;
		double valor = 0;
		String permanencia = " ";
		String saida = " ";

		if (horaEntrada <= horaSaida && duracaoMinutos >= 0) {
			permanencia = duracaoHoras + "h:" + duracaoMinutos + "min";

			if (duracaoHoras == 0 && duracaoMinutos <= 15) {
				valor = 0.00;
			} else if ((duracaoHoras == 1 && duracaoMinutos == 0) || (duracaoHoras == 0 && duracaoMinutos < 60)) {
				valor = 6.00;
			} else if ((duracaoMinutos == 0 && duracaoHoras == 2) || (duracaoHoras < 2 && duracaoMinutos > 0)) {
				valor = 12.00;
			} else if ((duracaoHoras <= 4 && duracaoMinutos == 0) || (duracaoHoras < 4 && duracaoMinutos > 0)) {
				valor = 18.00;

			} else if ((duracaoHoras <= 6 && duracaoMinutos == 0) || (duracaoHoras < 6 && duracaoMinutos > 0)) {
				valor = 20.00;
			} else {
				valor = 26.00;
			}

		} else if (horaEntrada > horaSaida && duracaoMinutos >= 0) {
			duracaoHoras = (24 - horaEntrada) + horaSaida;
			duracaoMinutos = (60 - minutosEntrada) + minutosSaida;
			permanencia = duracaoHoras + "h:" + duracaoMinutos + "min";

			if (duracaoHoras == 0 && duracaoMinutos <= 15) {
				valor = 0.00;
			} else if ((duracaoHoras == 1 && duracaoMinutos == 0) || (duracaoHoras == 0 && duracaoMinutos < 60)) {
				valor = 6.00;
			} else if ((duracaoMinutos == 0 && duracaoHoras == 2) || (duracaoHoras < 2 && duracaoMinutos > 0)) {
				valor = 12.00;
			} else if ((duracaoHoras <= 4 && duracaoMinutos == 0) || (duracaoHoras < 4 && duracaoMinutos > 0)) {
				valor = 18.00;

			} else if ((duracaoHoras <= 6 && duracaoMinutos == 0) || (duracaoHoras < 6 && duracaoMinutos > 0)) {
				valor = 20.00;

			} else {
				valor = 26.00;
			}

		} else {
			duracaoHoras = (23 - horaEntrada) + horaSaida;
			duracaoMinutos = (60 - minutosEntrada) + minutosSaida;
			permanencia = duracaoHoras + "h:" + duracaoMinutos + "min";
			valor = 26.00;

		}
		System.out.println("inserir CPF: (sim ou não):");
		String inserir = ler.next();

		if (duracaoHoras >= 24) {
			System.err.println("O veiculo não pode ficar mais de 24 horas no local");
		}

		else {

			if ((inserir.equalsIgnoreCase("sim"))) {
				System.out.println("informe o CPF: ");
				String cpf = ler.next();
				System.out.println("------------------------------");
				System.out.println("Rede pare bem: " + shopping);
				System.out.println("Placa: " + placa);
				System.out.println("Entrada: " + horaEntrada + ":" + minutosEntrada);
				System.out.println("Saida: " + horaSaida + ":" + minutosSaida);
				System.out.println("Permanencia: " + permanencia);
				System.out.println("Valor: " + valor);
				System.out.println("CPF: " + cpf);
				System.out.println("-------------------------------");
			} else {
				System.out.println("------------------------------");
				System.out.println("Rede pare bem: " + shopping);
				System.out.println("Placa: " + placa);
				System.out.println("Entrada: " + horaEntrada + ":" + minutosEntrada);
				System.out.println("Saida: " + horaSaida + ":" + minutosSaida);
				System.out.println("Permanencia: " + permanencia);
				System.out.println("Valor: " + valor);
				System.out.println("-------------------------------");
			}

		}
		ler.close();
	}

}
