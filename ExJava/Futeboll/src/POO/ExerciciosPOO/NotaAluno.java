package POO.ExerciciosPOO;

import java.util.Scanner;

public class NotaAluno {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        String nome;
        int  nota;
        double media;

        System.out.println("Entre com seu nome: ");
        nome = scan.next();

        System.out.println("Entre com sua primeira nota: ");
        nota = scan.nextInt();

        System.out.println("Entre com sua segunda nota: ");
        nota = scan.nextInt();

        System.out.println("Entre com sua terceira nota: ");
        nota = scan.nextInt();

        System.out.println("Entre com sua quarta nota: ");
        nota = scan.nextInt();

        media = (nota) /1;

        if(nota >=5 && nota <=9){
            System.out.println("Parabéns! Você passou de ano. Média " + media );
        } else if(nota <=4){
            System.out.println("Você reprovou!");
        } else if(nota == 10){
            System.out.println("Muito bem! Parabéns grande aluno. Sua nota foi " + media);
        } else {
            System.out.println("Opção inválida, tente novamente.");
        }










        
    }
    
}
