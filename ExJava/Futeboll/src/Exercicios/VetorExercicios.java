package Exercicios;

import java.util.Scanner;

public class VetorExercicios {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);


        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];

        for(int i =0; i<vetorA.length; i++){
            System.out.println("Entre com um valor da posição " + i);
            vetorA[i] = scan.nextInt();
            vetorB[i] =  vetorA[i];

            
            System.out.println("Vetor A =");
            for(int a = 0; i<vetorA.length; i++){
                System.out.println(vetorA[a] + " ");

            }
            System.out.println();
        }

        System.out.println("Vetor B =");
        for(int b =0; b<vetorA.length; b++){
            System.out.println(vetorA[b] + " ");

        }
        System.out.println();


    }
    
}
