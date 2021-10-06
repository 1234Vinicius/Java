
public class Caneta {
	
	
	private String nome;
	private String modelo;
	private float ponta;
	
	
	public void status(){
		
		System.out.println("Nome: " + this.getNome());
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Ponta: " + this.getPonta());
		
	}
		
		
		
		
	public Caneta(String nome, String modelo,float p) {
		super();
		this.nome = nome;
		this.modelo = modelo;
		this.ponta = ponta;
	}

	
	
	
	public String getNome() {
		return this.nome;
	}
	
	
	public void setNome(String n) {
		this.nome = n;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String m) {
		this.modelo = m;
	}
	
	
	
	
	

	public float getPonta() {
		return this.ponta;
	}


	public void setPonta(float p) {
		this.ponta = p;
	
		
	}
	
	}


	
	
	


