package AnimalHerança;

public class Cachorro extends Mamifero implements AnimalInterface {

    private String latir;
    private String comer;

    @Override
    public void alimentar() {
        System.out.println("Cachorro se alimentando");
        
        
    }

    @Override
    public void locomover() {
        System.out.println("Cachorro se locomovendo");
       
        
    }

    @Override
    public void emitirSom() {
        System.out.println("Cachorro emitindo som");
        
        
    }

    public String getComer() {
        return comer;
    }

    public void setComer(String comer) {
        this.comer = comer;
    }

    public String getLatir() {
        return latir;
    }

    public void setLatir(String latir) {
        this.latir = latir;
    }

    @Override
    public void veterinario() {
        System.out.println("Levando o cachorro para o veterinário");
       
        
    }

    @Override
    public void passsear() {
        System.out.println("Levando o cachorro para passear");
        
    }

    @Override
    public void brincar() {
        System.out.println("Levando o cachorro para brincar");
      
    }

    


    
}



    

