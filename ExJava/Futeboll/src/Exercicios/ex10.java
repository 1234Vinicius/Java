package Exercicios;

import java.util.Scanner;

public class ex10 {

    public static void main(String[] args) {

        // Exercício - Período que estudo - Matutino Vespertino ou diurno.
    //  Switch Case
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o turno que estuda: ");
        String turno = scan.next();

        switch(turno){

            case "m":
            case "M": System.out.println("Boa dia!"); break;
            case "v":
            case "V": System.out.println("Boa tarde!"); break;
            case "n":
            case "N": System.out.println("Boa noite!"); break;
            default:
            System.out.println("Noturno inválido");

            

        }


    }
    
}
