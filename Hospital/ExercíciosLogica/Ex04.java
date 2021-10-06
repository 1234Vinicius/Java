package ExercíciosLogica;

import java.util.Scanner;

import Hospital.main;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com seu nome: ");
        String nome = scan.next();

        System.out.println("Entre com seu peso: ");
        double peso = scan.nextDouble();

        System.out.println("Entre com seu Altura: ");
        double altura = scan.nextDouble();

        double imc;

        imc = peso /  (altura * altura);
        
        System.out.println("Imc é " + imc);

        if(imc <18.5){
            System.out.println(nome + " você está abaixo do peso.");
        } else if (imc >=18.5 && imc <=24.9){
            System.out.println(nome + " seu peso está normal");
        } else if(imc >=25 && imc <=29.9 ){
            System.out.println(nome + " seu imc está como sobrepeso ");
        } else if(imc >=30 && imc <=34.9){
            System.out.println(nome + " Grau de Obesidade l");
        } else if (imc >=35 && imc <=39.9){
            System.out.println(nome + " grau de obesidade ll");
        } else if(imc >=40){
            System.out.println("Grau de Obesidade lll ou Mórbida " + nome + " tem que se cuidar mais");
        } else {
            System.out.println("IMC inválido, por favor, digite novamente.");
        }





    }
    
}
