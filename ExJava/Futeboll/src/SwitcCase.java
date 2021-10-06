import java.util.Scanner;

public class SwitcCase {

    public static void main(String[] args) {
        

        Scanner scan = new Scanner(System.in);

        System.out.println("Entra com um dia da semana entre (1-7");

        int dia =  scan.nextInt();

        if(dia == 1){
            System.out.println("Domingo");
        } else if (dia == 2){
            System.out.println("Segunda-feira");
        } else if (dia == 3){
            System.out.println("Terça-Feira");
        
        } else if (dia == 4){
            System.out.println("Quarta-Feira");
        
        } else if (dia == 5){
            System.out.println("Quinta-Feira");

        } else if (dia == 6){
            System.out.println("Sexta-Feira");

        } else if (dia == 7){
            System.out.println("Sábado");

        } else {
            System.out.println("Dia da semana inválido");
        }


        switch(dia){
            case 1:
            System.out.println("Domingo");
            case 2:
            System.out.println("Segunda-feira");
            case 3:
            System.out.println("Terça-feira");
            case 4:
            System.out.println("Quarta-feira");
            case 5:
            System.out.println("Quinta-feira");
            case 6:
            System.out.println("Sexta-feira");
            case 7:
            System.out.println("Sábado");
            default:
            System.out.println("Dia da semana inválido");
        }





    }
    
}
