package Exercicios;

import java.util.Scanner;

public class Ex06 {


    public static void main(String[] args) {
        

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o primeiro número: ");
        int num1 = scan.nextInt();

        System.out.println("Entre com o segundo número: ");
        int num2 = scan.nextInt();

        System.out.println("Entre com o terceiro número: ");
        int num3 = scan.nextInt();

        if(num1 >= num2 && num1 >= num3){
            System.out.println("Número 1 é maior");
        } else if(num2 >= num1 && num2 >= num3){
            System.out.println("Número 2 é maior ");
        } else {
            System.out.println("Número 3 é maior");
        }


        if(num1 <= num2 && num1 <= num3){
            System.out.println("Número 1 é menor");
        } else if(num2 <= num1 && num2 <= num3){
            System.out.println("Número 2 é menor ");
        } else {
            System.out.println("Número 3 é  menor");
        }




    
}

}


