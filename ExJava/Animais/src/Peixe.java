
public class  Peixe extends Animais{
	
	private String corEscama;
	
	

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
		System.out.println("Soltando bolhas");
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	

}
