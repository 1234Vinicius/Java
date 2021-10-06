package Exercicios;

import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String[] [] compromisso = new String [31] [24];

        boolean sair = false;
        while(!sair);
        int opcao;

        System.out.println("Digite 1 para adicionar compromisso");
        System.out.println("Digite 2 para verificar compromisso");
        System.out.println("Digite 0 para sair");

        opcao = scan.nextInt();

        if(opcao == 1){ // Adicionar compromisso
           
            boolean diaValido = false;
            int dia;
            while(!diaValido);
            System.out.println("Entre com o dia do mês");
             dia = scan.nextInt(); 

             if(dia > 0 && dia <=31){
                 diaValido = true;
             } else {
                System.out.println("Dia inválido, digite novamente");
             }

            

        } else if (opcao == 2) { // Verificar compromisso

      
        } else if (opcao == 0) // sair
        sair = true;
    


   
    
    
}

}

