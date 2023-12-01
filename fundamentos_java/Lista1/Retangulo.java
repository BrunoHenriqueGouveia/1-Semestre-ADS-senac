import java.util.Scanner;

public class Retangulo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		//double base, altura, area, perimetro;

		//System.out.println("informe a base do retangulo:");
		//base = ler.nextDouble();
		//System.out.println("informe altura:");
		//altura = ler.nextDouble();

		//area = base * altura;
		//perimetro = 2 * base + 2 * altura;

		//System.out.println("area do retangulo: " + area);
		//System.out.println("o perimetro do retangulo: " + perimetro);

		//ler.close();
		
		
		System.out.println("informe 1° numero:");
		int num1 = ler.nextInt();
		System.out.println("informe 2° numero:");
		int num2 = ler.nextInt();
		
		int result = num1 + num2;
		
		System.out.printf("a soma do valor %d e %d é igual: %d", num1, num2, result);
	

		++num2;
		 num1++;
		
		

	}
}
