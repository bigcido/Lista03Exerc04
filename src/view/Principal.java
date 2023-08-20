package view;
import controller.tobin;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		tobin tb = new tobin();
		int n;
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor n: "));
		
		if (n > 2000) {
			JOptionPane.showMessageDialog(null, "Valor inválido");
			System.exit(0);
		}
		
		String s = String.valueOf(n);
		String binario = tb.tobin(n);
		System.out.println(binario);
		
	}

}
