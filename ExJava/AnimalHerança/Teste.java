package AnimalHerança;

public class Teste {

    public static void main(String[] args) {

        Ave ave = new Ave();
        Cachorro cachorro = new Cachorro();
        Mamifero mamifero = new Mamifero();
        Papagaio papagaio = new Papagaio();
        
        System.out.println("==============");
        ave.setNome("Papagaio");
        ave.setIdade(22);
        ave.setCorPena("verde");

        System.out.println("==============");

        cachorro.alimentar();
        cachorro.emitirSom();
        cachorro.brincar();
        cachorro.setNome("Buldogue");
        cachorro.setIdade(10);

        System.out.println("==============");

        System.out.println(ave.getNome());
        System.out.println(ave.getIdade());
        System.out.println(ave.getCorPena());

        System.out.println(cachorro.getComer());
        System.out.println(cachorro.getNome());
        System.out.println(cachorro.getCorPelo());
        System.out.println(cachorro.getLatir());



    }
    
}
