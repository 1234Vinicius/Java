import java.util.Scanner;

public class NumeroMaior {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o primeiro número: ");
        int num1 = scan.nextInt();

        System.out.println("Entre com o segundo número: ");
        int num2 = scan.nextInt();

        if(num1 > num2 ){
            System.out.println("Número 1 é maior que o número 2");
        } else {
            System.out.println("Número 1 é menor que o número 2");
        }


        
        
    }
    
}
