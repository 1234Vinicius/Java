package byteBank;

public class TesteReferencias {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.out.println("Saldo da primeira " + primeiraConta.saldo);
		
		Conta  segundaConta = primeiraConta;
		System.out.println("Saldo da segunda  conta " + segundaConta.saldo);
		
		
		segundaConta.saldo +=100;
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
			
		
		System.out.println("Primeira " + primeiraConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("Contas iguais");
		} else {
			System.out.println("Contas diferentes");
			
			
		}
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
		
	}

}
