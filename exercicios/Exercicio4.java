package generation.exercicios;



import javax.swing.JOptionPane;

public class Exercicio4 {
	public static void main(String[] args) {
		String nome;
		float nota1 = 0, nota2 = 0, media = 0;
		int aluno = 0;

		
		while (aluno <= 4) {
			nome = JOptionPane.showInputDialog("Digite seu nome, aluno " + aluno, null);
			nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a sua nota 1", null));
			nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a sua nota 2", null));
			
			if (nota1 > 10 || nota2 > 10) {
				JOptionPane.showMessageDialog(null, "Nota invalida", null, 0);
			} else {
				media = (nota1 + nota2) / 2;

				JOptionPane.showMessageDialog(null, "Ola " + nome + " A sua media é " + media, null, 0);
				aluno++;
			}
		}

	}

}
