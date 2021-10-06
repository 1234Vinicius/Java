

public class Random {
	
	public static void main(String[] args) {
		
		String Pessoa[] = {"Vinicius", "Carol", "Larissa", "João", "Marcio", 
				"Carlo", };
		
		double salario[] = {3500.99, 2222.22, 4444.33, 4322.22, 1000.00,6000.33};
		
		System.out.println("Número total de Pessoas: " + Pessoa.length);
		System.out.println("Número total de dinheiro R$" + 3500 + 2222 + 4444 + 4322 + 1000 + 6000);
		
		
		
		System.out.println("==================");
		
		for(int i = 0; i<=Pessoa.length; i++) {
			System.out.println(Pessoa[i] + " tem R$" + salario[i] + " de salario");
					
		}
		
		
	}
	
}
		
		
