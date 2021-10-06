import java.util.Scanner;

public class IfElsePreco {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o preço do item ");
        double preco = scan.nextDouble();

        if(preco <=10){
            System.out.println("Está barato, pode comprar");
        } else if(preco >10 && preco <15){
            System.out.println("Você pode pedir um desconto");
        } else if(preco >=15 && preco <17){
            System.out.println("Pode pesquisar mais");
        } else {
            System.out.println("Preço muito caro");
        }



    }
    
}
