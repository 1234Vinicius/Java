
public class Professor extends Pessoa {
	
	protected String especialidade;

	@Override
	public void alimentando() {
		System.out.println("Professor se alimentando");
		
	}

	@Override
	public void fazAnivers�rio() {
		System.out.println("Professor fez anivers�rio");
		this.idade++;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	
	
	
	

}
