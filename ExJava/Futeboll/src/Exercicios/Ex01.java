package Exercicios;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um número ");

        int numero = scan.nextInt();

        if(numero >= 0){
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }
        

    }

}