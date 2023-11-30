package Swittch;

import java.util.Scanner;

public class Ex3 {


	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("informe o codigo do funcionario:");
		int codigo = ler.nextInt();

		System.out.println("informe seu salario atual");
		double salarioAtual = ler.nextDouble();

		String cargo = "";
		double salarioNovo = 0;
		double aumento = 0;

		switch (codigo) {
		case 1:
			cargo = "Escriturário";
			aumento = porcentagem(salarioAtual, 50);
			salarioNovo = somar(salarioAtual, aumento);
			break;
		case 2:
			cargo = "Secretário";
			aumento = porcentagem(salarioAtual, 35);
			salarioNovo = somar(salarioAtual, aumento);
			break;
		case 3:
			cargo = "Caixa";
			aumento = porcentagem(salarioAtual, 20);
			salarioNovo = somar(salarioAtual, aumento);
			break;
		case 4:
			cargo = "Gerente";
			aumento = porcentagem(salarioAtual, 10);
			salarioNovo = somar(salarioAtual, aumento);
			break;
		case 5:
			cargo = "Diretor";
			aumento = 0;
			salarioNovo = salarioAtual;
			break;
		default:
			cargo = " invalido";
			break;
		}

		System.out.printf("O seu cargo é: %s %n o seu aumento R$:%.2f %n Novo salario R$:%.2f", cargo, aumento,
				salarioNovo);
		ler.close();

	}

	public static double porcentagem(double valor, double porcentagem) {
		return (valor * porcentagem) / 100;
	}

	public static double somar(double n1, double n2) {
		return n1 + n2;
	}

}
