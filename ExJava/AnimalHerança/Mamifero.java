package AnimalHerança;

public class Mamifero extends Animal {

    private String corPelo;

    @Override
    public void alimentar() {
        System.out.println("Mamífero se alimentando");
        
        
    }

    @Override
    public void locomover() {
        System.out.println("Mamífero se locomovendo");
       
        
    }

    @Override
    public void emitirSom() {
        System.out.println("Mamífero emitindo som");
        
        
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    


    
}
