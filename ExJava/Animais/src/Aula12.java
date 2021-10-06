
public class Aula12 {
	public static void main(String[] args) {
		
		
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		Canguru c = new Canguru();
		Arara  arara = new Arara();
		Cachorro cachorro = new Cachorro();
		Cobra cobra = new Cobra();
		Goldfish  peixe = new Goldfish();
		Tartaruga t = new Tartaruga();
		
		
		System.out.println("======CACHORRO=====");
		cachorro.locomover();
		cachorro.alimentar();
		cachorro.emitirSom();
		
		
		System.out.println("=====SOBRE O CANGURU======");
		c.locomover();
		c.alimentar();
		c.emitirSom();
		
		
		
		
		
		System.out.println("======SOBRE A AVE======");
		a.locomover();
		a.alimentar();
		a.emitirSom();

		
		System.out.println("======SOBRE O RÉPTIL");
		r.locomover();	
		r.alimentar();
		r.emitirSom();
		
		System.out.println("======SOBRE O PEIXE======");
		p.locomover();
		p.alimentar();
		p.emitirSom();
		
		System.out.println("======SOBRE O MAMÍFERO======");
		m.locomover();
		m.alimentar();
		m.emitirSom();
		
		
	}

}
