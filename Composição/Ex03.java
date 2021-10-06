package Composição;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        int pessoas = 0, homens = 0, mulheres = 0;



        Scanner scan = new Scanner(System.in);

        while(pessoas <=3){

            System.out.println("Entre com seu sexo: 1 para homem - 2 para mulher - 3 para sair");
            pessoas = scan.nextInt();

            if(pessoas == 1){
                homens++;
            }

            if(pessoas == 2){
                mulheres++;
            }


            

            pessoas++;
        }

        scan.close();

        

        System.out.println("Quantidade de homens " + homens);
        System.out.println("Quantidade de mulheres " + mulheres);



    }


}