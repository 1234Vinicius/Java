
public class Aula01 {
	
	public static void main(String[] args) {
		Visitante v = new Visitante();
		
		v.setNome("Vinicius");
		v.setIdade(19);
		v.setSexo("M");
		System.out.println(v.toString());
		
		Aluno a1 = new Aluno();
		a1.setNome("Vinicius");
		a1.setMatricula(1111);
		a1.setCurso("Inform�tica");
		a1.setIdade(16);
		a1.setSexo("M");
		a1.pagarMensalidade();
		
		
		Bolsista b1 = new Bolsista();
		b1.setNome("Vinicius");
		b1.setIdade(20);
		b1.setMatricula(2222);
		b1.setCurso("Administra��o");
		b1.setSexo("M");
		b1.setBolsa(12.5f);
		b1.renovarBolsa();
		b1.pagarMensalidade();
		
		
		
		
		
		
		System.out.print("Nome n�o � igual = " );
			if(!a1.getNome().equals(b1.getNome()))
				System.out.print("Verdadeiro");
			else 
				System.out.print("Falso");
				
				
		
	}

}
