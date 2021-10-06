
public class Main {
	
	public static void main(String[] args) {
		
		Arara a = new Arara();
		Cachorro c = new Cachorro();
		Mamifero m = new Mamifero();
		
		
		a.locomover();
		c.locomover();
		m.locomover();
		
		System.out.println("=============");
		
		a.alimentar();
		c.alimentar();
		m.alimentar();
		
		System.out.println("=============");
		
		a.emitirSom();
		c.emitirSom();
		m.emitirSom();
	}
	
	
	
	
}