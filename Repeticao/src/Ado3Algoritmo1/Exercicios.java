package Ado3Algoritmo1;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		
		Ex1();
		Ex2();
		Ex3();
		Ex4();
		Ex5();
		Ex6();
		Ex7();
		Ex8();
		Ex9();
		Ex10();
		Ex11();
		Ex12();
		Ex13();
		Ex14();
		Ex15();
		Ex16();
		Ex17();

	}

	public static void Ex1() {
		for (int i = 50; i <= 9500; i++) {
			if (i % 3 == 0) {
				System.out.print(i + ",");
			}
		}
	}

	public static void Ex2() {
		for (int i = 1; i <= 250; i++) {
			if (i % 10 == 0) {
				System.out.println(i + ": Multiplo de 10");
			} else {
				System.out.println(i);
			}
		}
	}

	public static void Ex3() {
		int soma = 0;
		for (int i = 1; i <= 100; i++) {
			soma = soma + i;
			if (i == 100) {
				System.out.print(i);
			} else {
				System.out.print(i + " + ");
			}
		}
		System.out.println(" = " + soma);

	}

	public static void Ex4() {

		Scanner ler = new Scanner(System.in);

		System.out.print("até qual termo deverá ser exibida a soma: ");
		int n1 = ler.nextInt();
		int soma = 0;
		for (int i = 1; i <= n1; i++) {
			soma = soma + i;
			if (i == n1) {
				System.out.print(i);
			} else {
				System.out.print(i + " + ");
			}

		}
		System.out.print(" = " + soma);
		ler.close();
	}

	public static void Ex5() {
		int soma = 0;
		int numero = 5;
		for (int i = 1; i <= 15; i++) {
			if (i == 15) {
				System.out.print(numero);
			} else {
				System.out.print(numero + ",");
			}
			soma = soma + numero;
			numero += 5;
		}
		System.out.println(" a soma dos numeros é: " + soma);
	}

	public static void Ex6() {
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe o numero de começo: ");
		int inicio = ler.nextInt();

		System.out.println("Informe o numero final: ");
		int fim = ler.nextInt();

		int soma = 0;
		int valor = inicio;

		while (inicio <= fim) {
			if (inicio == fim) {
				System.out.print(valor);
			} else {
				System.out.print(valor + ",");
			}
			soma = soma + valor;
			inicio++;
			valor += 5;
		}
		System.out.print(" A soma dos numeros é: " + soma);
		ler.close();
	}

	public static void Ex7() {
		double porcentagem = 1.5;
		double salario = 1000;
		for (int i = 2011; i <= 2023; i++) {
			salario = ((salario * porcentagem) / 100) + salario;
			porcentagem = porcentagem * 2;
			System.out.printf("Salario em %d :R$ %5.2f%n", i, salario);
		}
	}

	public static void Ex8() {
		Scanner ler = new Scanner(System.in);

		System.out.println("informe o seu salario carlos:");
		double salarioCarlos = ler.nextDouble();

		double salarioJoao = salarioCarlos / 3;
		int meses = 1;
		while (salarioCarlos >= salarioJoao) {
			salarioCarlos = ((salarioCarlos * 2) / 100) + salarioCarlos;
			salarioJoao = ((salarioJoao * 5) / 100) + salarioJoao;
			meses++;
		}
		System.out.printf("João ultrapassara o valor de Carlos em %d meses %nJoão R$:%5.2f %nCarlos R$:%5.2f", meses,
				salarioJoao, salarioCarlos);
		ler.close();

	}

	public static void Ex9() {
		Scanner ler = new Scanner(System.in);
		int num, soma = 0, qtd = 0;
		do {
			System.out.println("informe um numero:");
			num = ler.nextInt();
			if (num >= 0) {
				soma = soma + num;

			} else {
				qtd++;
			}
		} while (num != 0);

		System.out.println("A soma dos numeros positivos:" + soma);
		System.out.println("A quantidade dos numeros negativos são:" + qtd);
		ler.close();
	}

	public static void Ex10() {
		Scanner ler = new Scanner(System.in);
		double nota = 11;
		String situacao = "";

		while (nota > 10 || nota < 0) {
			System.out.println("informe a nota:");
			nota = ler.nextDouble();

			if (nota < 0 || nota > 10) {
				System.out.println("Nota invalida \ntente novamente");
			} else if (nota >= 6) {
				situacao = "aprovado";

			} else if (nota >= 5) {
				situacao = "recuperação";

			} else {
				situacao = "reprovado";
			}
		}

		System.out.println(" A situação do aluno é: " + situacao);
		ler.close();

	}

	public static void Ex11() {

		Scanner ler = new Scanner(System.in);
		int opcao = 0;
		double imposto = 0, aumento = 0;
		String classificacao = "";
		do {
			System.out.println("-------Menu de Opção-------");
			System.out.println("1 - Imposto");
			System.out.println("2 - Novo Salário");
			System.out.println("3 - Classificação");
			System.out.println("4 - Finalizar Programa");
			System.out.println("---------------------------");
			System.out.println("Digite a opção desejada: ");
			opcao = ler.nextInt();
			if (opcao > 4 || opcao < 1) {
				System.err.println("Opção inválida!");
			}
		} while (opcao > 4 || opcao < 1);

		if (opcao == 1) {
			System.out.println("Digite o valor do salário: ");
			double salario = ler.nextDouble();

			if (salario <= 1500) {
				imposto = salario * 0.05;
				System.out.println("O imposto é de 5%");
				System.out.println("Valor do imposto: " + imposto);
				System.out.println("Salario com desconto do imposto: " + (salario - imposto));
			} else if (salario <= 3000) {
				imposto = salario * 0.1;
				System.out.println("O imposto é de 10%");
				System.out.println("Valor do imposto: " + imposto);
				System.out.println("Salario com desconto do imposto: " + (salario - imposto));
			} else {
				imposto = salario * 0.15;
				System.out.println("O imposto é de 15%");
				System.out.println("Valor do imposto: " + imposto);
				System.out.println("Salario com desconto do imposto: " + (salario - imposto));
			}
		}

		else if (opcao == 2) {
			System.out.println("Digite o valor do salário: ");
			double salario = ler.nextDouble();

			if (salario <= 2000) {
				aumento = 130;
			} else if (salario <= 3000) {
				aumento = 150;
			} else if (salario <= 4500) {
				aumento = 200;
			} else {
				aumento = 250;
			}
			System.out.println("O seu novo salario: " + (salario + aumento));
		}

		else if (opcao == 3) {
			System.out.println("Digite o valor do salário: ");
			double salario = ler.nextDouble();
			if (salario <= 3000) {
				classificacao = "Mal remunerado";
			} else {
				classificacao = "Bem remunerado";
			}
			System.out.println("classificação: " + classificacao);
		} else if (opcao == 4) {
			System.out.println("Programa finalizado!");
		}
		ler.close();

	}

	public static void Ex12() {
		Scanner ler = new Scanner(System.in);
		double referencia, conta, faturamento = 0;
		int tipo = 0, qtdKw, qtd = 0;

		System.out.println("informe o valor de referência");
		referencia = ler.nextDouble() / 10;

		do {
			System.out.println(
					"informe a quantidade de KW gasta por consumidor\n(informe 0 para finalizar quantidade de consumidor)");
			qtdKw = ler.nextInt();
			if (qtdKw == 0) {
				break;
			}
			System.out.println("tipo de consumidor\n1:residencial\n2:comercial\n3:industrial");
			tipo = ler.nextInt();

			switch (tipo) {
			case 1:
				conta = (qtdKw * referencia) + (qtdKw * referencia * 0.05);
				System.out.println(conta);
				break;
			case 2:
				conta = (qtdKw * referencia) + (qtdKw * referencia * 0.10);
				break;
			case 3:
				conta = (qtdKw * referencia) + (qtdKw * referencia * 0.15);
				break;
			default:
				System.out.println("tipo de consumo invalido, tente novamente");
				continue;
			}
			faturamento += conta;
			if (conta >= 500 && conta <= 1000) {
				qtd++;
			}
			System.out.println("valor KW: " + referencia);
			System.out.println("o valor a ser pago por consumidor: " + conta);
		} while (true);

		System.out.println("o faturamento mensal foi de: " + faturamento);
		System.out.println("a quantidade de consumidores que pagaram entre R$500,00 e R$1000,00 foi de: " + qtd);
		ler.close();

	}

	public static void Ex13() {
		Scanner ler = new Scanner(System.in);

		System.out.print("Digite o número de termos desejado: ");
		int qtd = ler.nextInt();

		int num1 = 2;
		int num2 = 7;
		int num3 = 3;

		for (int i = 1; i <= qtd; i++) {
			if (i == qtd) {
				System.out.print(num1 + ", ");
				System.out.print(num2 + ", ");
				System.out.print(num3 + "...");
			} else {
				System.out.print(num1 + ", ");
				System.out.print(num2 + ", ");
				System.out.print(num3 + ", ");
			}
			num1 *= 2;
			num2 *= 3;
			num3 *= 4;

		}
		ler.close();

	}

	public static void Ex14() {
		Scanner ler = new Scanner(System.in);

		System.out.println("informe o numero da tabuada:");
		int num = ler.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}
		ler.close();
	}

	public static void Ex15() {
		Scanner ler = new Scanner(System.in);

		int idade = 0, qtdMenor18 = 0, qtdJogadores = 0, pesoMaior80 = 0;
		double peso = 0, altura = 0, mediaIdade1 = 0, mediaIdade2 = 0, mediaIdade3 = 0, mediaIdade4 = 0,
				mediaIdade5 = 0;

		for (int i = 1; i <= 5; i++) {

			System.err.println("time " + i);

			for (int j = 1; j <= 15; j++) {
				System.out.print("informe a idade do jogador " + j + " do time" + i + ":");
				idade = ler.nextInt();
				System.out.print("informe o peso do jogador " + j + " do time" + i + ":");
				peso = ler.nextDouble();
				System.out.print("informe altura do jogador " + j + " do time" + i + ":");
				altura = ler.nextDouble();

				if (idade < 18) {
					qtdMenor18++;
				}

				if (i == 1) {
					mediaIdade1 += idade;
				} else if (i == 2) {
					mediaIdade2 += idade;
				} else if (i == 3) {
					mediaIdade3 += idade;
				} else if (i == 4) {
					mediaIdade4 += idade;
				} else {
					mediaIdade5 += idade;
				}

				altura += altura;
				qtdJogadores++;

				if (peso > 80) {
					pesoMaior80++;
				}
			}
		}
		
		System.out.println(" A quantidade de jogadores com idade inferior a 18 anos são: " +qtdMenor18);
		System.out.println("A media de idade do time 1 é "+ (mediaIdade1/15));
		System.out.println("A media de idade do time 2 é "+ (mediaIdade2/15));
		System.out.println("A media de idade do time 3 é "+ (mediaIdade3/15));
		System.out.println("A media de idade do time 4 é "+ (mediaIdade4/15));
		System.out.println("A media de idade do time 5 é "+ (mediaIdade5/15));
		System.out.println("A media de alturas de todos jogadores do campeonato são: "+(altura/qtdJogadores));
		System.out.println("O percentual de jogadores acima de 80 Kg é:"+(pesoMaior80/qtdJogadores)*100);
		ler.close();
	}

	public static void Ex16() {
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o número: ");

		int maior = 0, menor = 1000, n = 0;

		while (n >= 0) {
			n = ler.nextInt();

			if (n > maior && n >= 0) {
				maior = n;
			}
			if (n < menor && n >= 0) {
				menor = n;
			}
		}
		System.out.println("O maior numero informado: " + maior);
		System.out.println("O menor numero informado: " + menor);
		ler.close();
	}

	public static void Ex17() {
		Scanner ler = new Scanner(System.in);

		int menor = 10000000, maior = 0, qtdPares = 0, qtdDi5 = 0, num = 0;
		double media = 0;

		System.out.println("informe os 15 numero");

		for (int i = 1; i <= 15; i++) {
			num = ler.nextInt();

			if (num > maior) {
				maior = num;
			}
			if (num < menor) {
				menor = num;
			}
			if (num % 2 == 0) {
				qtdPares++;
			}
			if (num % 5 == 0) {
				qtdDi5++;
			}
			media += num;

		}
		System.out.println("O maior numero informado: " + maior);
		System.out.println("O menor numero informado: " + menor);
		System.out.println("A media dos numeros informado: " + (media / 15));
		System.out.println("A quantidade de numeros pares é: " + qtdPares);
		System.out.println("A quantidade de numeros divisiveis por 5 é: " + qtdDi5);
		ler.close();

	}

}
