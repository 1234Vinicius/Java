import java.util.Scanner;

import javax.swing.JOptionPane;

public class LeituraDadosTeclado {

    public static void main(String[] args) {

        
        
       Scanner scan = new Scanner(System.in);


       System.out.println("Digite seu primeiro nome");
       String primeiroNome = scan.next();
       System.out.println("Seu primeiro nome é " + primeiroNome);
    
     
       System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome completo é " + nomeCompleto);

       

        System.out.println("Digite a sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Você tem  " + idade + " anos");

        System.out.println("Digite a sua altura: ");
        double altura = scan.nextDouble();
        System.out.println("A sua altura é " + altura + "cm"); 

        System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem bicinho de estimação");
        String primeiroNome1 = scan.next();
        int idade1 = scan.nextInt();
        byte qtdFilhos = scan.nextByte();
        float altura1 = scan.nextFloat();
        boolean temPet = scan.nextBoolean();

        System.out.println("Você digitou os seguintes valores: ");
        System.out.println("Primeiro nome: " + primeiroNome1);
        System.out.println("Idade: " + idade1);
        System.out.println("Quantidade de filhos: " + qtdFilhos);
        System.out.println("Altura" + altura1);
        System.out.println("Tem bichinho de estimação: " + temPet);

        Scanner imprimir = new Scanner(System.in);

        System.out.println("Digite seu nome completo");
        String nomeCompletoTeste = imprimir.nextLine();
        System.out.println("Seu nome completo é " + nomeCompletoTeste);

        System.out.println("Digite seu primeiro nome: ");
        String primeiroNomeTeste = imprimir.next();
        System.out.println("Seu primeiro nome é " + primeiroNomeTeste);

        System.out.println("Quantos anos você tem: ");
        int idadeTeste = imprimir.nextInt();
        System.out.println("Você tem " + idadeTeste + " anos");

        System.out.println("Digite a sua altura: ");
        float alturaTeste = imprimir.nextFloat();
        System.out.println("Sua altura é " + alturaTeste);

        System.out.println("Você sem filhos: ");
        boolean filhos = imprimir.nextBoolean(); 

        
      

        

        


    }
    
}
