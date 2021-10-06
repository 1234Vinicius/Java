package Exercicios;

import java.util.Scanner;

public class ex13 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        boolean infoValida = false;
        String nome;
        String senha;
        

       

        do {

            System.out.println("Entre com o nome do usuário: ");
             nome = scan.next();

            System.out.println("Entre com a senha do usuário: ");
             senha = scan.next();

            if(nome.equalsIgnoreCase(senha)) {
               
                System.out.println("Senha igual ao usuário, digite novamente");
            } else {
                infoValida = true;
                System.out.println("Senha e usuários válidos");
            }

        } while(! infoValida);
        
    }
    
}
