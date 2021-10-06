
public class Cliente {
	
	private String nome;
	private String sobrenome;
	private int idade;
	private int CPF;
	private int RG;
	private int identifica;
	
	
	
	
	public void statusPesso() {
		System.out.println("NOME: " + this.getNome());
		System.out.println("SOBRENOME: " + this.getSobrenome());
		System.out.println("IDADE: " + this.getIdade());
		System.out.println("CPF: " + this.getCPF());
		System.out.println("RG: " + this.getRG());
		System.out.println("Identificador " + this.identifica);
		
	
		}
			
			
		
		public void identificador(int identificador) {
			if(this.identifica >=18) {
				System.out.println("Você já é de maior");
				
			} else {
				System.out.println("Você é de menor");
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
	
	public int getCPF() {
		return CPF;
	
	}
	
	public void setCPF(int cPF) {
		CPF = cPF;
	
	}
	
	public int getRG() {
		return RG;
	}
	
	public void setRG(int rG) {
		RG = rG;
	
	}



	public int getIdentifica() {
		return identifica;
	}



	public void setIdentifica(int identifica) {
		this.identifica = identifica;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
