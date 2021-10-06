package ExercíciosLogica;

import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com seu nome: ");
        String nome = scan.nextLine();

        System.out.println("Entre com seu peso: ");
        double peso = scan.nextDouble();

        System.out.println("Entre com sua altura: ");
        double altura = scan.nextDouble();

        double imc;

        imc = peso /  (altura * altura);
        System.out.println(nome + " seu IMC está " + imc);

        if(imc >=18 && imc <=29.9){
            System.out.println(nome + " seu imc está ótimo");
        
        } else if(imc >=25 && imc<=29.9){
            System.out.println("Seu imc está um pouco alto!");

        } else if(imc >=30 && imc <=34.9){
            System.out.println(nome + " grau de obesidade l");
        } else if (imc >=35 && imc<=39){
            System.out.println(nome + " grau de obesidade ll");
        } else if(imc >=40){
            System.out.println(nome + " IMC ALTISSÍMO");
        } else{
            System.out.println("Imc inválido, por favor tente novamente");
        }
       
        }
    }


   


    
    

