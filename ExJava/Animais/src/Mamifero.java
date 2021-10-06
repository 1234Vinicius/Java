
public class Mamifero  extends Animais {
	
	private String corPelo;

	@Override
	public void locomover() {
		System.out.println("Correndo");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Alimentando");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de Mamífero");
		
	}

	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}


	public void setPeso(float peso) {
		
	}

	
	
	
	
	
	
	

}
