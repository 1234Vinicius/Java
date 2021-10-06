package Exercicios;

import javax.swing.JOptionPane;

public class soma{
    public static void main(String[] args) {
        

        int soma;
        int num1 = 0;
        int num2 = 0;

        String sn1 = JOptionPane.showInputDialog("Entre com um número: ");
        String sn2 = JOptionPane.showInputDialog("Entre com outro número:");

        num1 = Integer.parseInt(sn1);
        num2 = Integer.parseInt(sn2);

        soma = num1 + num2;

        JOptionPane.showMessageDialog(null, " O resultado da soma é " + soma);

        

    }
}