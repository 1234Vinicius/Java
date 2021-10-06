import java.util.Scanner;

public class Testando {
	
	public String nomeCarro;
	public int anoCarro;
	public String modeloCarro;
	public boolean funciona;
	
	
	
	public void status() {
		System.out.println("CARRO: " + this.getCarro());
		System.out.println("ANO: " + this.getAnoCarro());
		System.out.println("Modelo: " + this.getModeloCarro());
		System.out.println("Funciona " + this.getFunciona());

		
		
	}
	
	public String getCarro() {
		return nomeCarro;
	
	}
	
	public void setCarro(String nomeCarro) {
		this.nomeCarro = nomeCarro;
	
	}
	
	public int getAnoCarro() {
		return anoCarro;
	
	}
	
	public void setAnoCarro(int anoCarro) {
		this.anoCarro = anoCarro;
	
	}
	
	public String getModeloCarro() {
		return modeloCarro;
	
	}
	
	public void setModeloCarro(String modeloCarro) {
		this.modeloCarro = modeloCarro;
	
	}
	
	public boolean getFunciona() {
		return funciona;
	
	}
	
	public void setFunciona(boolean funciona) {
		this.funciona = funciona;
	}
	
	
	public void funcionar(boolean funciona) {
		if(this.funciona == true) {
			this.funciona = true;
			System.out.println("Seu carro está ligado");
		}
		
	}	
	
		public void funcionarr(boolean funciona) {
			if(this.funciona == false) {
				this.funciona = false;
				System.out.println("Seu carro não está pegando");
			}
		
		}
	
	

	
	

	
	
	
		
		
		
		
		
		
		
		
		

		
	      
	     
		
	}


