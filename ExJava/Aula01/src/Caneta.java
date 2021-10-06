
public class Caneta {
	
	
	public String  modelo;
	public String cor;
	public float ponta;
	protected int carga;
	protected boolean tampada;
	
	public void status() {
		System.out.println("Modelo " + this.modelo);
		System.out.println("Ponta " + this.ponta);
		System.out.println("A caneta �  " + this.cor);
		System.out.println("Carga " + this.carga);
		System.out.println("A caneta est� tampada? " + this.tampada);
	}
	
	
	
	void rabiscar() {
		
		if(this.tampada == true) {
			System.out.println("Erro! A caneta est� tampada");
		
	} else {
		System.out.println("Voc� pode escrever");
	}
	
}
	
	protected void tampar() {
		
		this.tampada = true;
		
	}
	
	protected void destampar() {
		this.tampada = false;
		
	}

}
