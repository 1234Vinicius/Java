package Composição;

import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

    int pessoas = 0, masc = 0, fem = 0, outros = 0;
    int calmas = 0, nervosas = 0, agressivas = 0;
    int idade, sexo, humor;
    int nervos40 = 0, calmo18 = 0;
    int HAgressivos = 0, MNervosas = 0;
    int outrosCalmos = 0;

    while(pessoas < 5){
    System.out.println("Informe seu genero: /n 1 para Masculino | 2 para Mulher | 3 para Outro: ");
    sexo = scan.nextInt();
    System.out.println("Informe sua idade: ");
    idade = scan.nextInt();
    System.out.println("Informe seu humor: /n 1 para Calmo (a / e) | 2 para Nervoso (a / e) | 3 para Agressiva (a / e):" );
    humor = scan.nextInt();

        if(humor == 1){
            calmas++;
        }

        if(sexo == 1 && humor == 3){
            HAgressivos++;
        }

        if(sexo == 2 && humor == 2){
            MNervosas++;
        }

        if(sexo == 3 && humor == 1){

        }

        if(idade <18 && humor == 1){
            calmo18++;
        }

        if(idade >= 40 && humor == 2 ){
            nervos40++;
        }

        pessoas++;

    }

    scan.close();

    System.out.println(" O numero de pessoas calmas: "  + calmas);
    System.out.println(" O numero de mulheres nervosas: "  +  MNervosas);
    System.out.println(" O numero de homens agressivos: "  +  HAgressivos);
    System.out.println(" O numero de outros calmos: "  + calmo18);
    System.out.println(" O numero de pessoas nervosas com mais de 40 anos: "  + nervos40);
    System.out.println(" O numero de pessoas calmas menores de 18 anos: "  + calmo18);
    
}

        
    }

    