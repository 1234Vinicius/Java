
public class Secretario extends Pessoa {
	
	protected String mudarTrabalho;

	@Override
	public void alimentando() {
		System.out.println("Secret�rio se alimentando");
		
	}

	@Override
	public void fazAnivers�rio() {
		System.out.println("Secret�rio fez anivers�rio");
		this.idade++;
	}

	public String getMudarTrabalho() {
		return mudarTrabalho;
	}

	public void setMudarTrabalho(String mudarTrabalho) {
		this.mudarTrabalho = mudarTrabalho;
	}
	
	
	
	
	
	

}
