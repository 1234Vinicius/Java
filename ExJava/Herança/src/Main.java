
public class Main {
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		System.out.println("=====================");
		System.out.println("INFORMA��ES DO ALUNO:");
		aluno.setNome("Vinicius");
		aluno.setEndereco("Rua jos� freitas");
		aluno.setNumeroCasa("211");
		aluno.setCpf("111-111-111-11");
		aluno.setTelefone("(11)99887799");
		
		
		System.out.println("Nome: " + aluno.getNome());
		System.out.println("Endere�o: " + aluno.getEndereco());
		System.out.println("N�mero da Casa: " + aluno.getNumeroCasa());
		System.out.println("CPF: " + aluno.getCpf());
		System.out.println("Telefone: " + aluno.getTelefone());
		System.out.println("=======================");
		
		
		Professor professor = new Professor();
		System.out.println("INFORMA��ES DO PROFESSOR:");
		professor.setNome("Marcos");
		professor.setSalario(1222.22);
		professor.setCpf("222-222-222-22");
		professor.setNomeCurso("TI");
		
		
		System.out.println("Nome: " + professor.getNome());
		System.out.println("Sal�rio: " + professor.getSalario());
		System.out.println("CPF: " + professor.getCpf());
		System.out.println("Profiss�o: " + professor.getNomeCurso());
		
	}

}
