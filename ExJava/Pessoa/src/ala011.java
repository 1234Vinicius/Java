
public class ala011 {
	
	public static void main(String[] args) {
		
		Visitante v1 = new Visitante();
		v1.setNome("Juvenal");
		v1.setIdade(22);
		v1.setSexo("M");
		System.out.println(v1.toString());
		
		
		
		Aluno l1 = new Aluno();
		l1.setNome("Vinicius");
		l1.setIdade(19);
		l1.setSexo("M");
		l1.pagarMensalidade();
		
		Bolsista b1 = new Bolsista();
		b1.setMatricula(112);
		b1.setNome("Jubileu");
		b1.setBolsa(12.5f);
		b1.setSexo("M");
		b1.pagarMensalidade();
		
		Professores p1 = new Professores();
		p1.setNome("Zé");
		p1.setIdade(47);
		p1.setSexo("M");
		p1.setSalario(2544.09f);
		p1.receberAumento();
		
		
		
		
		
		
		
	}

}
