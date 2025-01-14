
public class Controle implements aula11 {
	
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	public Controle() {
		this.volume = 50;
		this.ligado = true;
		this.tocando = false;
		
	}

	public int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean getLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean getTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	@Override
	public void ligar() {
		this.setLigado(true);
		
	}

	@Override
	public void desligar() {
		this.setLigado(false);
		
	}

	@Override
	public void abrirMenu() {
		System.out.println("=======MENU=======");
		System.out.println("Est� ligado? " + this.getLigado());
		System.out.println("Est� tocando? " + this.getTocando());
		System.out.println("Volume: " + this.getVolume());
		for(int volume = 0; volume <= this.getVolume(); volume++) {
			System.out.println("[]");
		}
		
	}

	@Override
	public void fecharMenu() {
		System.out.println("Fechando menu...");
		
	}

	@Override
	public void maisVolume() {
		if(this.getLigado()) {
			this.setVolume(this.getVolume()+ 5);
		
			
		}
		
	}

	@Override
	public void menosVolume() {
		if(this.getLigado()) {
			this.setVolume(this.getVolume()-5);
		} else {
			System.out.println("Imposs�vel diminuir volume");
		}
		
	}

	@Override
	public void ligarMudo() {
		if(this.getLigado() &&  this.getVolume()> 0) {
			this.setVolume(0);
		}
		
	}

	@Override
	public void desligarMudo() {
		if(this.getLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
		
	}

	@Override
	public void play() {
		if(this.getLigado() && this.getTocando()) {
			this.setTocando(true);
		} else {
			System.out.println("N�o consegui reproduzir");
		}
		
	}

	@Override
	public void pause() {
		if(this.getLigado() && this.getTocando()) {
			this.setTocando(false);
		} else {
			System.out.println("N�o consegui pausar");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	


}
