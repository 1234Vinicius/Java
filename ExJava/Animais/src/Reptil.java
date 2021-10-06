
public class Reptil extends Animais{
	
	private String escama;

	@Override
	public void locomover() {
		System.out.println("Rastejano");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo vegetais");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de Reptil");
		
	}

	public String getEscama() {
		return escama;
	}

	public void setEscama(String escama) {
		this.escama = escama;
	}
	
	
	
	

}
