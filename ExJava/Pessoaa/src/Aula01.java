
public class Aula01 {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		
		p1.setNome("Vinicius");
		p2.setNome("Carlos");
		p3.setNome("Zé");
		p4.setNome("Andreia");
		
		
		p1.setIdade(12);
		p2.setIdade(8);
		p3.setIdade(44);
		p4.setIdade(35);
		
		
		p2.setCurso("Informática");
		p3.setSalario(2222);
		
		p1.setSexo("M");
		p2.setSexo("M");
		p3.setSexo("M");
		p4.setSexo("F");
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
	}

}
