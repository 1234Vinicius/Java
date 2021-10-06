
public class Pessoa {
	
	private String nome;
	private String cpf;
	private int idade;
	private boolean destampar;
	
	public Pessoa(String nome, String cpf, int idade) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	
	
	
	public boolean isDestampar() {
		return destampar;
	}

	public void setDestampar(boolean destampar) {
		this.destampar = destampar;
	}

	public boolean equals(Object obj) {
	    if (obj instanceof Pessoa) {
	      Pessoa qualquer = (Pessoa) obj;
	      return this.cpf.equals(qualquer.getCpf());
	    }else {
	      return false;
	    }
	}
	
	
	
	
	
	
}



