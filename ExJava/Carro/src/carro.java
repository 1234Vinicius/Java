
public class carro {
	
	public String NomeCarro;
	public String corCarro;
	public String marcaCarro;
	public boolean anda;
	

	
	public void statusCarro() {
		
		System.out.println("Nome do Carro: " + this.getNomeCarro());
		System.out.println("Cor do carro: " + this.getCorCarro());
		System.out.println("Marca do carro: " + this.getMarcaCarro());
		System.out.println("Anda: " + this.getAnda());
		
		
		
	}
	
	public String getNomeCarro() {
		return NomeCarro;
	}
	public void setNomeCarro(String nomeCarro) {
		NomeCarro = nomeCarro;
	}
	public String getCorCarro() {
		return corCarro;
	}
	public void setCorCarro(String corCarro) {
		this.corCarro = corCarro;
	}
	public String getMarcaCarro() {
		return marcaCarro;
	}
	public void setMarcaCarro(String marcaCarro) {
		this.marcaCarro = marcaCarro;
	}
	public boolean getAnda() {
		return anda;
	}
	public void setAnda(boolean anda) {
		this.anda = anda;
	}
	
	public void andando() {
		if(this.anda == true) {
			System.out.println("Seu carro está em movimento");
		}
	}
	
	public void andandoo() {
		if(this.anda == false) {
			System.out.println("Seu carro está parado");
			this.anda = false;
		}
		
	}
	
	public void sabendo() {
		if(this.NomeCarro == "HRV") {
			System.out.println("Seu carro é bonito");
		} else {
			System.out.println("Seu carro é feio");
		}
	}
	
	
	

}
