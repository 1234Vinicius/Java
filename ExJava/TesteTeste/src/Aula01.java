
public class Aula01 {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		
		
		p1.setNome("Vinicius");
		p1.setIdade(19);
		p1.setSexo("M");
		
		
		p2.setNome("Z�");
		p2.setIdade(15);
		p2.fazerAniversario();
		p2.cancelarMatricula();
		
		p3.aumentarSalario(2222.22f);
		
		p4.mudarTrabalho();
		
		
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
		
	}

}
