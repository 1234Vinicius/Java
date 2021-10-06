package Exercicios;

import java.util.Scanner;

public class senhasIguais {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        boolean informacaoValida = false;
        String nome;
        String senha;

        do {

            System.out.println("Entre com o nome do usuário: ");
            nome = scan.next();

            System.out.println("Entre com a senha do usuário: ");
            senha = scan.next();

            if(nome.equalsIgnoreCase(senha)){
                informacaoValida = false;
                System.out.println("Usuário e senha iguais, tente novamente");
            } else {
                informacaoValida = true;
                System.out.println("Usuário e senha válido");
            }



        } while(! informacaoValida);


    }
    
}
