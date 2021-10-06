package Exercicios;

import java.util.Scanner;

public class NomeSobrenomeSexoEstadoCivil {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        boolean infoValida = false;
        String nome, sobrenome, sexo, estadoCivil, cor, temFilhos, olhos;
        double salario;
        int idade;

      



        do{ 
            System.out.println("=============");
            System.out.println("Entre com o seu nome: ");
            
            nome = scan.next();
           

            if(nome.length() >=3){
                infoValida = true;
                System.out.println("Nome validado com sucesso!");
            } else {
                infoValida = false;
                System.out.println("Nome precisa ter mais de três caracteres.");
            }


        } while(!infoValida);

        infoValida = false;

        do{
            System.out.println("=============");
            System.out.println("Entre com o seu sobrenome: ");
            sobrenome = scan.next();

            if(sobrenome.length() >=3){
                infoValida = true;
                System.out.println("sobrenome validado com sucesso!");
            } else {
                infoValida = false;
                System.out.println("sobrenome precisa ter mais de três caracteres.");
            }


        } while(!infoValida);

        infoValida = false;

        do{
            System.out.println("=============");
            System.out.println("Entre com o seu salário: ");
            salario = scan.nextDouble();

            if(salario >0 && salario <=1500){
                infoValida = true;
                System.out.println("Salário validado com sucesso!");
            } else {
                infoValida = false;
                System.out.println("Salário precisa está entre 0 e 150.");
            }


        } while(!infoValida);


        infoValida = false;

        do{
            System.out.println("=============");
            System.out.println("Entre com seu sexo: ");
            sexo = scan.next();

            if(sexo.equalsIgnoreCase("f")|| sexo.equalsIgnoreCase("m")|| 
            sexo.equalsIgnoreCase("Feminino")|| sexo.equalsIgnoreCase("Masculino")){
                infoValida = true;
                System.out.println("Sexo validado com sucesso!");
            } else {
                infoValida = false;
                System.out.println("Sexo precisa ser 'f' ou 'm'.");
            }


        } while(!infoValida);

        infoValida = false;


        do{
            System.out.println("=============");
            System.out.println("Entre com seu Estado Civil: ");
            estadoCivil = scan.next();

            if(estadoCivil.equalsIgnoreCase("s")|| estadoCivil.equalsIgnoreCase("c")|| 
            estadoCivil.equalsIgnoreCase("d") || estadoCivil.equalsIgnoreCase("v") ||
            estadoCivil.equalsIgnoreCase("Solteiro") || estadoCivil.equalsIgnoreCase("Casado") 
            || estadoCivil.equalsIgnoreCase("Divorciado") ||
             estadoCivil.equalsIgnoreCase("Viúvo")){
                infoValida = true;
                System.out.println("Estado Civil validado com sucesso!");
            } else {
                infoValida = false;
                System.out.println("Estado Civil  precisa ser 's' ou 'c', ou 'd', ou 'v'.");
            }





         

        do{
            System.out.println("=============");
            System.out.println("Entre com a sua idade: ");
            idade = scan.nextInt();

            if(idade >0 && idade <=150){
                infoValida = true;
                System.out.println("Idade validada com sucesso!");
            } else {
                infoValida = false;
                System.out.println("Idade  precisa está entre 0 e 150.");
            }


       


    } while(!infoValida);

    infoValida = false;


    do{
        System.out.println("=============");
        System.out.println("Entre com a sua cor preferida: ");
        
        cor = scan.next();
       

        if(cor.length() >=3){
            infoValida = true;
            System.out.println("Cor validada com sucesso!");
        } else {
            infoValida = false;
            System.out.println("Cor precisa ter pelo menos 3 caracteres.");
        }


        infoValida = false;

        do{
            System.out.println("=============");
            System.out.println("Qual é a cor dos seus olhos?: ");
            olhos = scan.next();

            if(olhos.equalsIgnoreCase("verde") || olhos.equalsIgnoreCase("azul")|| 
            olhos.equalsIgnoreCase("preto")|| olhos.equalsIgnoreCase("castanho")){
                infoValida = true;
                System.out.println("Processo concluído com sucesso!");
            } else {
                infoValida = false;
                System.out.println("Cor dos olhos inválido.");
            }


    } while(!infoValida);



} while(!infoValida);



                System.out.println("============");
                System.out.println("Suas informações foram salvas: ");
                System.out.println("Nome: " + nome);
                System.out.println("Sobrenome: " + sobrenome);
                System.out.println("Idade: " + idade + " anos");
                System.out.println("Salário: R$" + salario);
                System.out.println("Sexo: " + sexo);
                System.out.println("Estado Civil: " + estadoCivil);
                System.out.println("Cor preferida: " + cor);
                System.out.println("Cor dos olhos: " + olhos);
                

     

    } while(!infoValida);





    }

   
    }
    

