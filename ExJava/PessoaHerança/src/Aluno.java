
public class Aluno extends Pessoa{
	
	protected int matricula;

	@Override
	public void alimentando() {
		System.out.println("Aluno se alimentando");
		
	}

	@Override
	public void fazAnivers�rio() {
		System.out.println("Aluno fazendo anivers�rio");
		this.idade++;
		
		
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	
	
	

}
