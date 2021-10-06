package POO.ExerciciosPOO;

public class LivrariaMain {

    public static void main(String[] args) {
        

        LivroLivraria  livro = new LivroLivraria();
        livro.nome = "Como programar em Java";
        livro.autor = "Vinicius";
        livro.qtdPaginas = 700;
        livro.anoLancamento = 2010;
        livro.preco = 65.5;

        System.out.println(livro.preco);
        
    }
    
}
