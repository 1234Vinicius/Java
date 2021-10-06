package Exercicios;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class test {

    public static void main(String[] args) {

        int soma;
        int num1 = 0;
        int num2 = 0;

        int subtracao;
        int sub1 = 0;
        int sub2 = 0;

        String sn1 = JOptionPane.showInputDialog("Entre com um número para somar" );
        String sn2 = JOptionPane.showInputDialog("Entre com outro número para somar");

        String subUm = JOptionPane.showInputDialog("Entre com um número:");
        String subDois = JOptionPane.showInputDialog("Entre com outro número: ");

        num1 = Integer.parseInt(sn1);
        num2 = Integer.parseInt(sn2);

        soma = num1 + num2;

        JOptionPane.showMessageDialog(null, "O resultado da soma é " + soma);

        sub1 = Integer.parseInt(subUm);
        sub2 = Integer.parseInt(subDois);

        subtracao = sub1 - sub2;

        JOptionPane.showInputDialog(null,"O resultado da subtração é " + subtracao);
        
        


        
    }

}
