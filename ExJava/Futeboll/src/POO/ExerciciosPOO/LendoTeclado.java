package POO.ExerciciosPOO;

import java.util.Scanner;

public class LendoTeclado {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com seu nome: ");
        String  nome = scan.next();

        System.out.println("Entre com sua idade: ");
        int idade = scan.nextInt();

        System.out.println("Entre com seu peso: ");
        double peso = scan.nextDouble();

        System.out.println("Entre com sua altura: ");
        double altura = scan.nextDouble();

        System.out.println("Entre com seu nome completo");
        String nomeCompleto = scan.next();

        System.out.println("============");
        System.out.println("Suas informações foram salvas: ");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Peso " + peso);
        System.out.println("Altura: " + altura);
        System.out.println("Nome completo " + nomeCompleto);
    }
    
}
