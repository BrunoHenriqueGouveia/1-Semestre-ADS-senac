import java.util.Scanner;

public class Operadoreslogicos2 {
	public  static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("ola , informe uma cor:");
		String cor = ler.nextLine();
		boolean cores = cor.contains("vermelho") ||
				            cor.contains("azul") || 
				            cor.contains("amarelo");
		System.out.print("a sua cor é primaria: "+ cores);
		
		
		
		
	}

}
