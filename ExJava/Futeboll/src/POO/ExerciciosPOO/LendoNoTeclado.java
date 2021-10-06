package POO.ExerciciosPOO;

import java.util.Scanner;

public class LendoNoTeclado {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com seu nome: ");
        String nome = scan.next();

        System.out.println("Entre com a sua idade: ");
        int idade = scan.nextInt();

        System.out.println("Entre com seu peso: ");
        float peso = scan.nextFloat();

        System.out.println("Entre com sua altura: ");
        float altura = scan.nextFloat();

        System.out.println("================");
        System.out.println("Suas informações foram salvas: ");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);










    }
    
}
