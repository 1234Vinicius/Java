package Exercicios;

import java.util.Scanner;

public class ex14 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        boolean infoValida = false;
        String nome,sobrenome ,sexo, estadoCivil;
        int idade;
        double salario;




        infoValida = false;

        do {

            System.out.println("Entre com o nome:");
            nome = scan.next();

            if(nome.length() >=3){
                infoValida = true;
                System.out.println("Nome registrado com sucesso!");
            } else {
                System.out.println("Nome precisa no mínimo 3 caracteres.");
            }



        } while(!infoValida);


        do {

            System.out.println("Entre com o sobrenome:");
            sobrenome = scan.next();

            if(sobrenome.length() >=3){
                infoValida = true;
                System.out.println("Sobrenome registrado com sucesso!");
            } else {
                System.out.println("Sobrenome precisa ter no mínimo 3 caracteres.");
            }



        } while(!infoValida);

        infoValida = false;

        do {

            System.out.println("Entre com a idade:");
            idade = scan.nextInt();

            if(idade >=0 && idade <=150){
                infoValida = true;
                System.out.println("Idade registrada com sucesso!");
            } else {
                System.out.println("Idade precisa ser entre 0 e 150.");
            }



        } while(!infoValida);

        infoValida = false;

        do {

            System.out.println("Entre com o salario:");
            salario = scan.nextDouble();

            if(salario >0){
                infoValida = true;
                System.out.println("Salário registrado com sucesso!");
                
            } else {
                System.out.println("Salário precisa ser maior que 0");
            }



        } while(!infoValida);

        infoValida = false;

        do {

            System.out.println("Entre com o sexo");
            sexo = scan.next();

            if(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")){
                infoValida = true;
                System.out.println("Sexo registrado com sucesso!");
                
            } else {
                System.out.println("Sexo precisa ser 'f' ou 'm' ");
            }



        } while(!infoValida);

        infoValida = false;

        do {

            System.out.println("Entre com o seu estado civil: ");
            estadoCivil = scan.next();

            if(estadoCivil.equalsIgnoreCase("s") || sexo.equalsIgnoreCase("c")
            || estadoCivil.equalsIgnoreCase("v") ||   estadoCivil.equalsIgnoreCase("d")){
                infoValida = true;
                System.out.println("Estado civil registrado com sucesos!");
                
            } else {
                System.out.println("Estado civil precisar ser 's'[solteiro], 'c'[casado], 'd'[divorsiado], 'v'[viuvo] ");
            }

            System.out.println(" =====================");
            System.out.println("Sua informações foram registradas com sucesso!:");
          
            System.out.println("Nome: " + nome);
            System.out.println("Sobrenome: " + sobrenome);
            System.out.println("Idade: " + idade + " anos");
            System.out.println("Salário: R$" + salario );
            System.out.println("Sexo: " + sexo);
            System.out.println("Estado Civil: " + estadoCivil);
            System.out.println("Nome completo: " + nome + sobrenome);



        } while(!infoValida);



    }
    
}

