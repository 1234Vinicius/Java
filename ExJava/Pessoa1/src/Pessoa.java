
public class Pessoa {
	
	private String nome;
	private String sobrenome;
	private int idade;
	private float altura;
	private float peso;
	private String cpf;
	private String rg;
	private boolean comer;
	
	
	public void statusPessoa() {
		System.out.println("===== PESSOA =====");
		System.out.println("Nome:  " + this.getNome());
		System.out.println("Sobrenome: " + this.getSobrenome());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Altura: " + this.getAltura());
		System.out.println("Peso: " + this.getPeso());
		System.out.println("CPF: " + this.getCpf());
		System.out.println("RG: " + this.getRg());
		System.out.println("Está comendo? " + this );
		
	}
	
	
	public void comendo() {
		if(this.comer == true) {
			System.out.println("Está comendo");
		} else {
			System.out.println("Não está comendo");
		}
		
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public boolean isComer() {
		return comer;
	}
	public void setComer(boolean comer) {
		this.comer = comer;
	}
	
	
	
	
	

	
	
	
	
	

}
