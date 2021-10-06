package ExercíciosLogica;

import java.util.Scanner;

public class Ex02 {


   
        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);
            double aumento = 1.5, salario = 2000, ano = 2006; //criação das variáveis
            
            do{
                salario = salario + (salario * aumento / 100); // 1000 + 1.5%
                aumento = aumento * 2; // 1.5% * 2
                ano++; // ano + 1
            }while(ano <= 2012); // enquanto for menor ou igual a 2012, faça
    
            System.out.println(salario); // imprime o salário
        }
    }
    

           