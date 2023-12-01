import javax.swing.JOptionPane;

public class grausCelsius {
	public static void main(String[] args) {
		double grau;
		
		
	     grau = Double.parseDouble(JOptionPane.showInputDialog(null,"informe quantos graus esta hoje na sua cidade:"));
		
		double resultado = grau + 273.15;
		
		JOptionPane.showInternalMessageDialog(null, String.format("O Graus Celsius da sua cidade esta %.0f°\n Em kelvin a temperatura é: %.2f", grau, resultado));
		
		
		
		
		
		
	}

}
