package Exercicios;

import java.util.Scanner;

public class ex12 {

    public static void main(String[] args) {
        

        Scanner scan = new Scanner(System.in);

        System.out.println("Selecione um período: M - Matutino - V Vespertino - N - Noturno");

        System.out.println("Qual o seu nome: ");
        String aluno = scan.next();

        System.out.println("Em que período você estuda: ");
        String turno = scan.next();
        
       

       if(turno.equalsIgnoreCase("matutino")){
           System.out.println("Bom dia " + aluno);
       } else if (turno.equalsIgnoreCase("vespertino")){
           System.out.println("Boa tarde " + aluno);
        
       } else if(turno.equalsIgnoreCase("noturno")){
           System.out.println("Boa noite " + aluno);

       } else {
           System.out.println("Período inválido");
       }
      
    

    }
    
}
