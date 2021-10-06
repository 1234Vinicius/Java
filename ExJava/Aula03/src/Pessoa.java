
public class Pessoa {
	
	String nomePessoa;
	float alturaPessoa;
	int pesoPessoa;
	boolean pessoaTemFilho;
	
	
	void saber() {
		if(this.pessoaTemFilho == true) {
			System.out.println("Você tem filhos");
		} else 
			System.out.println("Você não tem filhos");
	}
	
	void status() {
		System.out.println("Seu nome é " + this.nomePessoa);
		System.out.println("A sua altura é " + this.alturaPessoa);
		System.out.println("O seu peso é " + this.pesoPessoa);
		
	}


}

