
public class Mamifero extends Animal{

	protected String corPelo;
	
	
	@Override
	public void locomover() {
		System.out.println("Mam�fero se locomovendo");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Mam�fero se alimentando");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Mam�fero emitindo som");
		
	}
	

	
	
}