package Exemplos;

public class ExemploQuadrado {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 6; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		System.out.println();

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 6; j++) {
				if (i == 2 && j == 5) {
					System.out.print("R");
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
		
		
		System.out.println();

		
		int contador1 = 1;
		int contador2 = 10;
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 10; j++) {
				if (i < 5 && j > contador1 && j < contador2) {
					System.out.print(" ");

				} else {
					System.out.print("|");
				}

			}
			contador1++;
			contador2--;
			System.out.println();
		}

	}

}
