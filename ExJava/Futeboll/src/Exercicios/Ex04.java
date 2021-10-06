package Exercicios;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com uma nota: ");
        double nota1 = scan.nextInt();

        System.out.println("Entre com outra nota: ");
        double nota2 = scan.nextInt();

        double media = (nota1 + nota2)/2;


        if(media >= 7){
            System.out.println("Aprovado com média " + media);
        } else if (media == 10){
            System.out.println("Aprovado com media " + media );
        } else if (media <7) {
            System.out.println("Reprovado com nota " + media);
        } else {
            System.out.println("Nota inválida");
        }
        
        }

    }
    

