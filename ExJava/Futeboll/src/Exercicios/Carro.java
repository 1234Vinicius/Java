package Exercicios;

import java.util.Scanner;

public class Carro {

     
        public static void main(String[] args) {

          double nota;
          double media;

          System.out.println("Entre com a primeira  nota: ");
          nota = new Scanner(System.in).nextDouble();

          
          System.out.println("Entre com a segunda  nota: ");
          nota = new Scanner(System.in).nextDouble();

          System.out.println("Entre com a terceira  nota: ");
          nota = new Scanner(System.in).nextDouble();

          System.out.println("Entre com a quarta  nota: ");
          nota = new Scanner(System.in).nextDouble();

          media = (nota)/ 1;

          if(nota >=5 && nota <=9){
              System.out.println("Parabéns, sua média foi " + media);
          } else if (nota <=4 && nota >=0){
              System.out.println("Você foi reprovado");
          } else if (nota == 10 ){
              System.out.println("Parabéns! Você foi um excelente aluno sua média foi  " + media );
          } else {
              System.out.println("Nota inválida");
          }
            
          

          

         
          






        
    }

}
    
    

