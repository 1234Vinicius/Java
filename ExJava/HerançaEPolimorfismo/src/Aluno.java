
public class Aluno extends Pessoa{
	
	private String curso;
	private double[] notas;
	
	
	public Aluno() {
		super();
	}
	
	public Aluno(String nome, String endereco, String telefone, String curso) {
		super();
		this.curso = curso;
		
		
	}
	
	public void verificarAcesso() {
		this.nomeVisibilidade = "Vinicius";
		super.nomeVisibilidade = "Vinicius";
		
	}
	
	
	
	
	
	
	
	public String getCurso() {
		return curso;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public double[] getNotas() {
		return notas;
	}
	
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	
	public String obterEtiquetaEndereco() {
		String s  = "Endere�o do aluno:";
		s += super.getEndereco();
		return s;
		
	}
	
	
	


}
