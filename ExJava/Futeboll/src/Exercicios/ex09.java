package Exercicios;

import java.util.Scanner;


public class ex09 {

    // Exercício - Período que estudo - Matutino Vespertino ou diurno.
    // Utilizando o IF ELSE
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o turno em que estuda");

        String turno = scan.next();

        if(turno.equalsIgnoreCase("matutino")){
            System.out.println("Bom dia!");
        } else if (turno.equalsIgnoreCase("vespertino")){
            System.out.println("Boa tarde!");
        } else if (turno.equalsIgnoreCase("noturno")){
            System.out.println("Boa noite!");

        } else {
            System.out.println("Período inválido");
        }
        

    }
    
}
