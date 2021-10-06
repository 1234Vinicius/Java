
public class Professor extends Pessoa {
	
	protected String especialidade;

	@Override
	public void alimentando() {
		System.out.println("Professor se alimentando");
		
	}

	@Override
	public void fazAniversário() {
		System.out.println("Professor fez aniversário");
		this.idade++;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	
	
	
	

}
