
public class Pessoa {
	
	String nomePessoa;
	float alturaPessoa;
	int pesoPessoa;
	boolean pessoaTemFilho;
	
	
	void saber() {
		if(this.pessoaTemFilho == true) {
			System.out.println("Voc� tem filhos");
		} else 
			System.out.println("Voc� n�o tem filhos");
	}
	
	void status() {
		System.out.println("Seu nome � " + this.nomePessoa);
		System.out.println("A sua altura � " + this.alturaPessoa);
		System.out.println("O seu peso � " + this.pesoPessoa);
		
	}


}

