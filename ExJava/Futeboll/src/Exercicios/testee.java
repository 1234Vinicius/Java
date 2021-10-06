package Exercicios;

import java.util.Scanner;

public class testee {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        boolean infoValida = false;
        String nome, sobrenome;

        do {    

            System.out.println("Entre com seu nome: ");
            nome = scan.next();

            System.out.println("Entre com seu sobrenome: ");
            sobrenome = scan.next();

            if(nome.length() >=3){
                infoValida = true;
                System.out.println("Nome concluído com sucesso.");

            } else {
                infoValida = false;
                System.out.println("Nome precisa possuir pelo menos 3 caracteres");
            }


        } while(!infoValida);

        infoValida = false;

        

        


       



    }
    
}
