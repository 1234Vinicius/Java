
public class Caneta {
	
	private String modeloCaneta;
	private String corDaCaneta;
	private boolean temTinta;
	private boolean tampada;
	
	
	public void status() {
		System.out.println("Modelo: " + this.getModeloCaneta());
		System.out.println("Cor: " + this.getCorDaCaneta());
		System.out.println("Tem Tinta?: " + this.temTinta);
		System.out.println("Está tampada?: " + this.tampada);
		
	}
	
	public void tinta() {
		if(this.temTinta == true) {
			System.out.println("Caneta com tinta");
			System.out.println("Caneta rabiscando");
		} else {
			System.out.println("Caneta falhando");
		}
	
		
		
	}
	
	public void tampa() {
		if(this.tampada == true) {
			System.out.println("Caneta tampada");
			System.out.println("Não dá para rabiscar");
		} 
		
		
	}
	
	public void destampada() {
		if(this.tampada == false) {
			System.out.println("Caneta destampada");
			System.out.println("Já pode rabiscar");
		}  else {
			System.out.println("Não pode rabiscar");
		}
			
		
	}
	
	public String getModeloCaneta() {
		return modeloCaneta;
	
	}
	
	public void setModeloCaneta(String modeloCaneta) {
		this.modeloCaneta = modeloCaneta;
	
	}
	public String getCorDaCaneta() {
		return corDaCaneta;
	
	}
	public void setCorDaCaneta(String corDaCaneta) {
		this.corDaCaneta = corDaCaneta;
	
	}
	public boolean isTemTinta() {
		return temTinta;
	
	}
	public void setTemTinta(boolean temTinta) {
		this.temTinta = temTinta;
	
	}
	public boolean isTampada() {
		return tampada;
	
	}
	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	
	}
	
	
	
	
	

}
