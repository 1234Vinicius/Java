
public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		Contaum contaMarcela = new Contaum();
		System.out.println(contaMarcela.pegaSaldo()); 
		
		contaMarcela.titular = "Marcela";
		System.out.println(contaMarcela);
	}

}
