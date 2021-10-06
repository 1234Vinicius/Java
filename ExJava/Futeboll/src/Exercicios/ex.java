package Exercicios;

import java.util.Scanner;

public class ex{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome, sobrenome, sexo;
        int idade;
        boolean infoValida = false;

        do {

            System.out.println("Entre com seu nome: ");
            nome = scan.next();

            if(nome.length() >=3){
                infoValida = true;
                System.out.println("Nome registrado com sucesso! ");
            } else {
                infoValida = false;
                System.out.println("Nome precisa ter pelo menos 3 caracteres");
            }


     } while(!infoValida);


     infoValida = false;


     do {

        System.out.println("Entre com seu sobrenome: ");
        sobrenome = scan.next();

        if(sobrenome.length() >=3){
            infoValida = true;
            System.out.println("Sobrenome registrado com sucesso! ");
        } else {
            infoValida = false;
            System.out.println("Sobrenome precisa ter pelo menos 3 caracteres");
        }


 } while(!infoValida);

 infoValida = false;

 do {

    System.out.println("Entre com seu sexo: ");
    sexo = scan.next();

    if(sexo.equalsIgnoreCase("m")|| sexo.equalsIgnoreCase("masculino")
    || sexo.equalsIgnoreCase("f")|| sexo.equalsIgnoreCase("feminino")){
        infoValida = true;
        System.out.println("Sexo registrado com sucesso! ");
    } else {
        infoValida = false;
        System.out.println("Sexo precisa ser m ou f ")
        ;
    }


} while(!infoValida);





        System.out.println("============");
        System.out.println("Informações salvas com sucesso.");
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Sexo: " + sexo);

        


    }
}