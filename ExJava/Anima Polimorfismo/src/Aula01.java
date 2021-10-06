
public class Aula01 {
	
	public static void main(String[] args) {
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		Arara arara = new Arara();
		Cobra cobra = new Cobra();
		Cachorro cachorro = new Cachorro();
		Tartaruga tartaruga = new Tartaruga();
		Goldfish peixe = new Goldfish();
		Canguru canguru = new Canguru();
		
		canguru.locomover();
		a.locomover();
		p.locomover();
		r.locomover();
		m.emitirSom();
		cachorro.emitirSom();
		canguru.usarBolsa();
		
	}

}
