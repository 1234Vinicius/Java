import POO.Pessoa;

public class Professor extends Pessoa {

    protected double salario;
    protected String fazerAniversario;

    public void aniversario(){
        System.out.println("Professor fazendo aniversário");
    }


    

    @Override
    public void correr() {
        System.out.println("Professor fazendo aniversário");
        
    }

    @Override
    public void alimentar() {
       System.out.println("Professor se alimentando");
        
    }

    @Override
    public void andar() {
       System.out.println("Professor andando");
        
    }
    
}
