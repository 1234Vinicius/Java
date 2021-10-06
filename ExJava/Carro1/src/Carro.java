
public class Carro {
	
	private String fabricante;
	private String modelo;
	private int ano;
	private boolean motorLigado;
	private int velocidade;
	
	
	public String ligarMotor() {
		if( motorLigado ) {
			return "O motor do " + this.modelo + " já estava ligado.";
		}
		this.motorLigado = true;
		return "O motor do " + this.modelo + " foi ligado agora.";
		
		
	}
	
	
	
	public String situacaoMotor() {
		
		if( motorLigado) {
			return this.modelo + " --> Motor ligado";
		
		} else {
			return this.modelo + " --> Motor desligado";
			
		}
			
		}
		
	
	
	
	public void detalhes() {
		System.out.println("===== CARRO =====");
		System.out.println("Fabricante: " + this.getFabricante());
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Ano: " + this.getAno());
		System.out.println("Motor ligado: " + this.motorLigado);
		System.out.println("Velocidade: "  +  this.getVelocidade ());
		System.out.println("Motor do carro: " + this.situacaoMotor());
		System.out.println( "\n");
	}
	
	
	 // Método Construtor simples
	
	public Carro() {
		super();
	}

	 // Método Construtor Completo
	
	public Carro(String fabricante, String modelo, int ano, boolean motorLigado, int velocidade) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.ano = ano;
		this.motorLigado = motorLigado;
		this.velocidade = velocidade;
	
	}
	
	
	public Carro(String fabricante, String modelo, int ano) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.ano = ano;
		this.motorLigado = false;
		this.velocidade = 0;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public boolean isMotorLigado() {
		return motorLigado;
	}

	public void setMotorLigado(boolean motorLigado) {
		this.motorLigado = motorLigado;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	
	
	
	
	
	
	
	
	

}
