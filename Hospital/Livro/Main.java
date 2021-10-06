package Livro;

import Hospital.main;

public class Main {

    public static void main(String[] args) {

        Livro livro = new Livro();
      
        livro.setLeitor("Vinicius");
        livro.setAutor("José Silveira da Silva");
        livro.setNomeLivro("Como aprender a programar");
        livro.setQtdPaginas(700);
        livro.setLeuLivroTodo(true);
        livro.leitorLeuLivroTodo();
        livro.statusLivro();


        Biblioteca biblioteca = new Biblioteca();
        biblioteca.setNomePessoa("Vinicius");
        biblioteca.setRg("11-111-111-1");
        biblioteca.setDataEntrega("22.10.2021");
        biblioteca.setCpf("111-111-111-11");
        biblioteca.setNomeLivro("Os incríveis");
        biblioteca.statusBiblioteca();


        
            

        
    }
    
}
