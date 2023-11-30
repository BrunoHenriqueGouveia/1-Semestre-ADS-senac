package Lista1;

import java.util.Scanner;

public class Ex2 {
      public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe total de eleitores:");
        int eleitores = ler.nextInt();
        
        System.out.println("Informe total de votos branco:");
        int vbrancos = ler.nextInt();
        
        System.out.println("Informe total de votos nulos:");
        int vnulos = ler.nextInt();
        
        System.out.println("Informe total de votos valido:");
        int valido = ler.nextInt();
        

        double porbranco =  100.0 * vbrancos/eleitores;
        double pornulo =  100.0 * vnulos/eleitores;
        double poreleitores = 100.0 * valido/eleitores;
        
        System.out.printf("A porcentagem de votos brancos: %2.2f%% %n", porbranco);
        System.out.printf("A porcentagem de votos nulos  : %2.2f%% %n", pornulo);
        System.out.printf("A porcentagem de votos validos: %2.2f%% %n", poreleitores);
	}

}
