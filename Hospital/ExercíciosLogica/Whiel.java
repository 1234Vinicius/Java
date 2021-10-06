package ExercíciosLogica;

import java.util.Scanner;


public class Whiel {

    public static void main(String[] args) {

        boolean usuarioValido = false;
        
        Scanner scan = new Scanner(System.in);

       do{

     System.out.println("Entre com seu usuário: ");
        String usuario = scan.nextLine();

       if(usuario.equalsIgnoreCase("com")){
           usuarioValido = true;
           System.out.println("==============================");
           System.out.println("Usuário cadastrado com sucesso!");
           System.out.println("==============================");
       } else if(usuario == ""){
        System.out.println("==============================");
           System.out.println("Usuário incorreto, tente novamente");
           System.out.println("==============================");
       } else {
        System.out.println("==============================");
           System.out.println("Entre com o usuario novamente");
           System.out.println("==============================");
       }



    } while(!usuarioValido);



    }

  

    
    
}
