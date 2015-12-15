package br.com.main;

import javax.swing.JOptionPane;

public class StartMain {
	 public static void main(final String args[]) {
	        String valoresCaracteres = JOptionPane.showInputDialog("Informe os caracteres: ");

	        if (BalanCaracteres.verificaCaracteres(valoresCaracteres) == true)
	            JOptionPane.showMessageDialog(null, "ESTÁ BALANCEADA.");

	        if (BalanCaracteres.verificaCaracteres(valoresCaracteres) == false)
	            JOptionPane.showMessageDialog(null, "NÃO ESTÁ BALANCEADA.");
	    } 
}
