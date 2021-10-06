package Exercicios;

import javax.swing.JOptionPane;

public class tabuada {

    public static void main(String[] args) {
        

        int numero = 0;
        int tabuada = 0;


        numero = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número"));

        for(int i = 1; i<=10; i++){
            tabuada = numero * i;
          
            System.out.println(numero + "x" + i +  "=" + tabuada);   
        }

        



    }
    
}
