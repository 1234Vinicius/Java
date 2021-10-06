
public class mainum {
	
	public static void main(String[] args) {
		
		Contaum contaVinicius = new Contaum();
		contaVinicius.saldo = 200;
		contaVinicius.deposita(50);
		System.out.println(contaVinicius.saldo);
		boolean conseguiuRetirar = contaVinicius.sacar(100);
		System.out.println(contaVinicius.saldo);
		System.out.println(conseguiuRetirar);
		
		Contaum contaMarcela = new Contaum();
		contaMarcela.deposita(1000);
		
		contaMarcela.transfere(300, contaVinicius);
		System.out.println(contaMarcela.saldo);
		System.out.println(contaVinicius.saldo);
		
		contaVinicius.titular = "Vinicius Cordeiro";
		System.out.println(contaVinicius.titular);
		
	

}

}