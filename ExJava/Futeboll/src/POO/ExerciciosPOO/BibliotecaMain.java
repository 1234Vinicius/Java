package POO.ExerciciosPOO;

import  java.util.Date;

public class BibliotecaMain {

    public static void main(String[] args) {

        LivroBiblioteca livro = new LivroBiblioteca();

        livro.emprestado = true;
        livro.dataEntrega = new Date();
        livro.LivroEmprestado = "Vinicius";

        System.out.println("Suas informações foram salvas: ");
        System.out.println("Livro emprestado: " + livro.emprestado);
        System.out.println("Está emprestado o livro: " + livro.LivroEmprestado);
        System.out.println("Data de entrega: " + livro.dataEntrega);


        
       
        

        
    }
    
}
