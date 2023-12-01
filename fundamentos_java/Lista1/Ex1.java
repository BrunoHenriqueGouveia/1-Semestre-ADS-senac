package Lista1;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int num = ler.nextInt();
		int ant = num - 1;
		int suc = num + 1;
		char a = (char) (num);
		char x = (char) (ant);
	    char y = (char) (suc);
	    
	    System.out.println("=============");
	    System.out.printf("| %c | %c | %c |%n", x,a,y);
	    System.out.println("=============");
		
		
		
	}

}
