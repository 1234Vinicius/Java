package ExercíciosLogica;

import Hospital.main;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        double media;
        double total;
        double nota;

        
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com seu nome: ");
        String nome = scan.nextLine();

        System.out.println("Entre com sua primeira nota: ");
        int nota1 = scan.nextInt();

       

        System.out.println("Entre com sua segunda nota: ");
        int nota2 = scan.nextInt();

        
        System.out.println("Entre com sua terceira nota: ");
        int nota3= scan.nextInt();

        
        System.out.println("Entre com sua quarta nota: ");
        int nota4 = scan.nextInt();

        
       

       total =  (nota1 + nota2 + nota3 + nota4);

       media = total/4;
      

        System.out.println("Sua média ficou em " + media);
    }



    
}
