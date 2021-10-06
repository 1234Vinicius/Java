package ExercíciosLogica;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        String nome;
        double salario, novoSalario, acrescimo;
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Nome: ");
        nome = scan.nextLine();

        System.out.println("Salário: ");
        salario = scan.nextDouble();

        System.out.println("Acréscimo: ");
        acrescimo = scan.nextDouble();
        

        novoSalario = salario * ((acrescimo  /  100) + 1);
        System.out.println(nome + " receberá " + novoSalario);
        

    }


    
}
