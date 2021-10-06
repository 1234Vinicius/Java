package AnimalHerança;

import java.util.Set;

public abstract class Animal {

    protected String nome;
    protected int idade;


    public abstract void alimentar();
    public abstract void locomover();
    public abstract void emitirSom();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    


    
}
