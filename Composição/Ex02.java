package Composição;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        String nome, sobrenome, sexo;
        int idade;
        double peso, altura;
        boolean infoValida = false;


        Scanner scan = new Scanner(System.in);


        do{

            System.out.println("Nome: ");
            nome = scan.nextLine();

            if(nome.length() >1){
                 infoValida = true;
                 System.out.println("Nome cadastrado com sucesso!");
            } else {
                infoValida = false;
                System.out.println("Nome precisa ter mais que um caractere");
            }

        } while(!infoValida);

        infoValida = false;

        
        do{

            System.out.println("Sobrenome: ");
            sobrenome = scan.nextLine();

            if(sobrenome.length() >1){
                 infoValida = true;
                 System.out.println("Sobrenome cadastrado com sucesso!");
            } else {
                infoValida = false;
                System.out.println("Sobrenome precisa ter mais que um caractere");
            }

        } while(!infoValida);

        infoValida = false;


        do{

            System.out.println("Idade: ");
            idade = scan.nextInt();

            if(idade >0){
                 infoValida = true;
                 System.out.println("Idade cadastrado com sucesso!");
            } else {
                infoValida = false;
                System.out.println("Idade precisa ser maior ou igual a 1 ");
            }

        } while(!infoValida);

        infoValida = false;


        do{

            System.out.println("Sexo: ");
            sexo = scan.nextLine();

            if(sexo.equalsIgnoreCase("feminino") || sexo.equalsIgnoreCase("masculino")
            || sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")){
                 infoValida = true;
                 System.out.println("Sexo cadastrado com sucesso!");
            } else {
                infoValida = false;
                System.out.println("Sexo precisa ser f ou m | | feminino ou masculino");
            }

        } while(!infoValida);

        infoValida = false;
        
        
        
        do{

            System.out.println("Peso: ");
            peso = scan.nextDoble();

            if(peso >0){
                infoValida = true;
                System.out.println("Peso cadastrado com sucesso!")
                } else {
                 infoValida = false;
                 System.out.println("Peso precisa ser maior que 0!");
                
                }
           

        } while(!infoValida);
        
        infoValida = false;
        
        
        do{

            System.out.println("Altura: ");
            altura = scan.nextDoble();

            if(altura >1.30){
                infoValida = true;
                System.out.println("Altra cadastrada com sucesso!")
                } else {
                 infoValida = false;
                 System.out.println("Altura precisa ser maior que 1.30!");
                
                }
           

        } while(!infoValida);
        
        
        System.out.println("Nome: " + nome);
         System.out.println("Sobrenome: " + sobrenome);
         System.out.println("Idade: " + idade + " anos);
         System.out.println("Sexo: " + sexo);
         System.out.println("Nome: " + nome);
          System.out.println("Peso: " + peso);
          ystem.out.println("Altra: " + altura);
        


       



       

            



















      



     
        
        
    }


   

    
    
}
