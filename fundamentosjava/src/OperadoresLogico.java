import java.util.Scanner;

public class OperadoresLogico {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("ola,crie uma senha: \n (precisa de um caracter) ");
		String senha = ler.nextLine();
		
		int num = senha.length();
		boolean forte = num >= 6;
		boolean caract = senha.contains("@") || senha.contains("#") || senha.contains("*") || senha.contains("%") ||senha.contains("!");
		boolean validade = forte && caract;
		boolean numero = senha.contains("0") || senha.contains("0") || senha.contains("1") || senha.contains("2") || senha.contains("3") || senha.contains("4") || 
				senha.contains("5") || senha.contains("6") || senha.contains("7") || senha.contains("8") || senha.contains("9");
		boolean validade2= validade && numero;
		if (validade2) {System.out.println("sua senha é forte e \n tem pelo menos um caracter");}
		
		else { System.out.println("sua senha esta fraca , crie outra senha"); } 
		
		
		
		
		
		
		
		
	}

}
