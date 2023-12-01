import javax.swing.JOptionPane;

public class somar {
	public static void main (String[] args) {
		double nota1 , nota2,nota3,nota4,mediafinal;
		String nome;
		JOptionPane.showMessageDialog(null, "seja bem vindo");
		
		nome = JOptionPane.showInputDialog(null, "QUAL SEU NOME:");
		
		JOptionPane.showConfirmDialog(null, "vamos ver sua media final:", "A media do aluno", JOptionPane.INFORMATION_MESSAGE);
		
		nota1 = Double.parseDouble
				(JOptionPane.showInputDialog("informe sua 1° nota:"));
		
		nota2 = Double.parseDouble
				(JOptionPane.showInputDialog("Informe sua 2° nota:"));
		nota3 = Double.parseDouble
				(JOptionPane.showInputDialog("Informe sua 3° nota:"));
		
		nota4 = Double.parseDouble
				(JOptionPane.showInputDialog("Informe sua 4° nota:"));
		
		mediafinal = (nota1 + nota2 + nota3 + nota4 ) /4;
		
		JOptionPane.showMessageDialog
		          (null , String.format
		        		  ( "A media do Aluno %s é %.2f", nome, mediafinal));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
