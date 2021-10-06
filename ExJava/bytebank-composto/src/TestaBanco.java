
public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente vinicius = new Cliente();
		vinicius.nome = "Vinicius";
		vinicius.cpf = "222.222.222-22";
		vinicius.profissão = "TI";
		
		Contaum contaVinicius = new Contaum();
		contaVinicius.deposita(100);
		
		
		contaVinicius.titular = "Vinicius";
		System.out.println(contaVinicius.titular);
		System.out.println(contaVinicius.titular);
		
	}

}
