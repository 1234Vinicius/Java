package byteBank;

public class CriaConta {
	
	
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		
		primeiraConta.saldo +=100;
		System.out.println(primeiraConta.saldo);
		
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("Primeira conta tem  R$" + primeiraConta.saldo);
		System.out.println("Segunda conta tem R$" + segundaConta.saldo);
		
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta);
		
		
		primeiraConta.agencia = 4433;
		System.out.println("A sua agência é " + primeiraConta.agencia);
		
		segundaConta.agencia = 4868;
		System.out.println("A sua agência é  " + segundaConta.agencia);
		
		
		System.out.println(primeiraConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("São a mesmissíma conta");
		} else {
			System.out.println("Contas diferentes");
		}
		
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
		
	
	}

}
