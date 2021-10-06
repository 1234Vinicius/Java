package Livro;

import java.util.Set;

public class Livro implements LivroInterface {

    private String leitor;
    private String nomeLivro;
    private String autor;
    private int qtdPaginas;
    private boolean leuLivroTodo;


    public void statusLivro(){
        System.out.println("Leitor: " + this.leitor);
        System.out.println("Nome do Livro: " + this.nomeLivro);
        System.out.println("Autor: " + this.autor);
        System.out.println("Quantidades de Páginas: " + this.qtdPaginas);
        System.out.println("Você leu o livro todo: " + this.leuLivroTodo);
    }
    
    
    @Override
    public void leitor() {
        System.out.println("Leitor " + this.leitor);
      
    }

    public String getLeitor() {
        return leitor;
    }

    public void setLeitor(String leitor) {
        this.leitor = leitor;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }

    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    public boolean getLeuLivroTodo() {
        return leuLivroTodo;
    }

    public void setLeuLivroTodo(boolean leuLivroTodo) {
        this.leuLivroTodo = leuLivroTodo;
    }

    public void leitorLeuLivroTodo(){
        if(this.leuLivroTodo == true){
            System.out.println("=================================");
            System.out.println("Leitor leu o livro todo, parabéns!");
        } else {
            System.out.println("Você não leu o livro todo");
        }
    }

    
    
}
