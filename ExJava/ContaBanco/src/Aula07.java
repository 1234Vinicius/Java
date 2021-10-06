
public class Aula07 {
	
	public static void main(String[] args) {
		
		ContaBanco  banco = new ContaBanco();
	
		banco.setNumConta(1111);
		banco.setDono("Vinicius");
		banco.abrirConta("CC");
		banco.depositar(100);
		banco.sacar(50);
		
		banco.estadoAtual();
		
		System.out.println("=====================");
		
		
		
		ContaBanco banco2 = new ContaBanco();
		banco2.setNumConta(2222);
		banco2.setDono("Carol");
		banco2.abrirConta("CP");
		banco2.depositar(50);
		banco2.sacar(100);
		banco2.estadoAtual();
		
		
		
		
		
		
		
	}

}
