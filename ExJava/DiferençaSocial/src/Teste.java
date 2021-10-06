
public class Teste {
	
	public static void main(String[] args) {
		
		Rico rico = new Rico();
		Pobre pobre = new Pobre();
		Mendiga mendigo = new Mendiga();
		
		System.out.println("SOBRE O POBRE: ");
		pobre.setNome("Zequinha");
		pobre.setIdade(45);
		pobre.trabalha();
		System.out.println("==============");
		
		System.out.println("SOBRE O RICO: ");
		rico.setNome("Haliman");
		rico.setIdade(60);
		rico.setDinheiro(290992009);
		rico.fazerCompras();
		System.out.println("==============");
		
		System.out.println("SOBRE O MENDIGO");
		mendigo.setNome("Valdo");
		mendigo.setIdade(32);
		mendigo.mendiga();
		
		
		
		
		
		
	}

}
