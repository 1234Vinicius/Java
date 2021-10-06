package Exercicios;

public class PessoasArray {

    public static void main(String[] args) {
        
        String pessoa1 = "Vinicius";
        String pessoa2 = "Maria";
        String pessoa3 = "José";
        String pessoa4 = "João";
        String pessoa5 = "Carlos";
        String pessoa6 = "Larissa";

        String[] listaPessoas = new  String[5];

        listaPessoas[0] = "Maria";
        listaPessoas[1] = "José";
        listaPessoas[2] = "João";
        listaPessoas[3] = "Carlos";
        listaPessoas[4] = "Vinicius";

        System.out.println("A lista da pessoa1 é " + listaPessoas[0]);
        System.out.println("A lista da pessoa2 é " + listaPessoas[1]);
        System.out.println("A lista da pessoa3 é " + listaPessoas[2]);
        System.out.println("A lista da pessoa4 é " + listaPessoas[3]);
        System.out.println("A lista da pessoa5 é " + listaPessoas[4]);

        System.out.println("Tamanho da array: " + listaPessoas.length);

        System.out.println("Valores da array: " + listaPessoas);

        for(int i = 0; i<listaPessoas.length; i++){
           
            System.out.println("A lista da pessoa1 " + (i+1) + " é " + listaPessoas[i]);
        }

    }
    
}
