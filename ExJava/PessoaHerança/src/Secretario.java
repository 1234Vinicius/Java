
public class Secretario extends Pessoa {
	
	protected String mudarTrabalho;

	@Override
	public void alimentando() {
		System.out.println("Secretário se alimentando");
		
	}

	@Override
	public void fazAniversário() {
		System.out.println("Secretário fez aniversário");
		this.idade++;
	}

	public String getMudarTrabalho() {
		return mudarTrabalho;
	}

	public void setMudarTrabalho(String mudarTrabalho) {
		this.mudarTrabalho = mudarTrabalho;
	}
	
	
	
	
	
	

}
