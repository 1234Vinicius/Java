
public class TesteSacaNegativo {
	
	public static void main(String[] args) {
		Contaum conta = new Contaum();
		conta.deposita(100);
		System.out.println(conta.sacar(100));
		
		conta.sacar(101);
		System.out.println(conta.pegaSaldo());
		
	
	

}

}