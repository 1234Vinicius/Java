
public class Casa {
	
	
	public String ruaDaCasa;
	public float cepCasa;
	public int numeroCasa;
	
	
	
	
	public void statusCasa() {
		
		System.out.println("Voc� mora na rua " + this.getruaDaCasa());
		System.out.println("CEP da Casa: " + this.getcepCasa());
		System.out.println("N�mero da Casa: " + this.getnumeroCasa());
	
	
	}
	
	
	
	public String getruaDaCasa() {
		
		return this.ruaDaCasa;
	}
	
	public void setruaDaCasa(String r) {
		this.ruaDaCasa = r;

	}
	
	
	public float getcepCasa() {
		return this.cepCasa;
	}
	
	public void setcepCasa(int c) {
		this.cepCasa = c;
	}
	
	public int getnumeroCasa() {
		return this.numeroCasa;
	}
	
	public void setnumeroCasa(int n) {
		this.numeroCasa = n;
	}
	
	
	
	
	
	
	
}
