
public class Pessoa {
	
	public String nomePessoa;
	public int idadePessoa;
	public String cor;
	public boolean temFihos;
	
	
	
	public String getnomePessoa() {
		return this.nomePessoa;
	}
	
	public void setnomePessoa(String p) {
		this.nomePessoa =  p;
	}
	
	public int getidadePessoa() {
		return this.idadePessoa;
	}
	
	public void setidadePessoa(int n ) {
		this.idadePessoa = n;
	}
	
	public String getcor() {
		return this.cor;
	}
	
	public void setCor(String c) {
		this.cor = c;
	}
	
	public void status() {
		System.out.println("Sobre a pessoa:");
		System.out.println("Nome " + this.nomePessoa);
		System.out.println("Idade " + this.idadePessoa);
		System.out.println("Cor: " + this.cor );
	}
	
	
	void saber() {
		if(this.temFihos == true) {
			System.out.println("Tem filhos");
		} else 
			System.out.println("Não tem filhos");
	
		}
		
	}
	
	



