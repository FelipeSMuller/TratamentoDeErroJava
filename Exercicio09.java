package Exercicios;

import javax.swing.JOptionPane;

public class Exercicio09 {

	public static void main(String[] args) {
		/*
		 * /* Divisão por zero: Peça ao usuário para digitar dois números e realize uma
		 * divisão. Use um bloco try para capturar exceções de divisão por zero e exibir
		 * uma mensagem de erro com catch.
		 */

		int numero1 = 0, numero2 = 0;

		try {
			numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número"));
			numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número"));

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, " Você não digitou um número, tente novamente");
		}
		if (numero1 == 0 || numero2 == 0) {
			JOptionPane.showMessageDialog(null, " Um dos valores não pode ser 0 ou nulo , ERRO!");

		} else {

			JOptionPane.showMessageDialog(null, " Resultado final = " + (numero1 / numero2));
		}
	}

}
