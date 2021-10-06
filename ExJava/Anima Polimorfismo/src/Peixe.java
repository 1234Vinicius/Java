
public class Peixe extends Animal{
	
	protected String corEscama;
	
	
	@Override 
	public void locomover() {
		System.out.println("Nadando");
	}
	
	
	@Override
	public void alimentar() {
		System.out.println("Comendo subst�ncias");
		
	}
	
	@Override 
	public void emitirSom() {
		System.out.println("Peixe n�o faz som");
		
	}
	
	
	public void soltarBolhas() {
		System.out.println("Soltando uma bolha");
	}


	public String getCorEscama() {
		return corEscama;
	}


	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
	
	
	
	
	

}
