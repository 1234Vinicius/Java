
public class ProgramaPrincipal {
	
	public static void main(String[] args) {
		
		Lutador l[] = new Lutador[3];	
		
		
		l[0] = Lutador.newObj().nome("Vinicius ").nacionalidade("Brasil").idade(10).peso(20)
				.altura(0).vitorias(2).derrotas(4).empates(1).build();
		l[1] = Lutador.newObj().nome("Vinicius ").nacionalidade("Brasil").build();
		
		l[2] = Lutador.newObj().build();
		
		
		System.out.println("=======LUTADOR 1 =======");
		l[0].apresentar();
		l[0].status();
		System.out.println("=======LUTADOR 2=======");
		l[1].apresentar();
		
		
	
		
		
	}

}
