package ExercíciosLogica;

import java.util.Scanner;

public class TestaSalario {

    public static void main(String[] args) {

        String nome;
        double salario, novoSalario, acrescimo;
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Nome: ");
        nome = leitor.nextLine();

        System.out.println("Salário: ");
        salario = leitor.nextDouble();

        System.out.println("Acréscimo: ");
        acrescimo = leitor.nextDouble();

        novoSalario  = salario * ((acrescimo / 100) + 1);
        System.out.println(nome + " receberá " + novoSalario);
    }
    
}
