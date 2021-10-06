package Exercicios;

import java.util.Scanner;

public class ex16 {

    public static void main(String[] args) {

        int numero = 2;
        int numero1 = 3;

        System.out.println("Numero1 == numero2 " + (numero == numero1));
        System.out.println("Numero1 ! numero2 " + (numero != numero1));
        System.out.println("Numero1 > Numero2 " + (numero > numero1));
        System.out.println("Numero2 > Numero2 " + (numero1 > numero));
        System.out.println("=============");


        String ola = "olá";
        String mundo = " mundo";
        String olaMundo = ola.concat(mundo);
        System.out.println(olaMundo); 
        System.out.println("===========");


        String espaco = "I S P A Ç O"; 
        String semEspaco = espaco.replace("I", "E");
        System.out.println(semEspaco);
        semEspaco = semEspaco.replaceAll(" ", "");
        System.out.println(semEspaco);

        String mensagem = "    isso    é   um   teste: ";
        System.out.println(mensagem.trim());   
        System.out.println(mensagem);
        System.out.println("==========");
        
        String teste = "Estou testando a minha frase: ";
        System.out.println(teste.substring(6, 15));
        System.out.println(teste);
        System.out.println("========");


        Scanner scan = new Scanner(System.in);
        

        System.out.println("Entre com o seu nome: ");
        String nome = scan.next();
        System.out.println("Que nome bonito você tem " + nome + "!");


        






        

       

    }
}

        
