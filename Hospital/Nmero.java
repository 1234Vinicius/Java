

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Nmero {

    public static void main(String[] args) {

        String a="";
        int num=0;
        int antecessor=0;
        int sucessor=0;  // declaração das variaveis
        
        a = JOptionPane.showInputDialog("Entre com o número"); // tela para se inserir o número e jogar na String "a"
        num = Integer.parseInt(a); // transforma "a" num inteiro e atribui a "num"
        
        antecessor = num -1; // tira 1 de num
        sucessor = num +1; // soma 1 a num
   
        JOptionPane.showMessageDialog(null, " O antecessor de " + num + " é " + antecessor + "\n O sucessor de " + num + " é " + sucessor);
        
    }

   
    

    

   




    
    
}
