package POO.ExerciciosPOO;

public class LivroMain {

    public static void main(String[] args) {
        
        Livro livro = new Livro();
        livro.nome = "Como programar em Java";
        livro.autor = "Vinicius";
        livro.qtdPaginas = 700;
        livro.anoLancamento = 2010;
        
        System.out.println("Suas informações foram salvas: ");
        System.out.println("Nome do livro: " + livro.nome);
        System.out.println("Autor: " + livro.autor);
        System.out.println("Quantidades de páginas:  " + livro.qtdPaginas);
        System.out.println("Nome do livro: " + livro.anoLancamento);
        


    }
    
}
