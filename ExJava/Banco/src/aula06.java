
public class aula06 {
	
	public static void main(String[] args) {
		
		Conta p1 = new Conta();
		p1.setnumConta(1111);
		p1.setDono("Vinicius");
		p1.abrirConta("CC");
		p1.depositar(100);
		
		
		
		Conta p2 = new Conta();
		p2.setnumConta(2299);
		p2.setDono("Creuza");
		p2.abrirConta("CP");
		p2.depositar(100);
		
		
		
		
		p1.estadoAtual();
		p2.estadoAtual();
		
		
	}

}
