
public class main {
	

	
	public static void main(String[] args) {
	Conta primeiraConta = new Conta();
	primeiraConta.saldo = 100;
	System.out.println("O seu saldo é: " + primeiraConta.saldo);
	
	primeiraConta.saldo += 200;
	System.out.println(primeiraConta.saldo);
	
	
	
	
	System.out.println("Saldo da primeira conta R$" + primeiraConta.saldo);
	
	Conta segundaConta = primeiraConta;
	
	System.out.println("Saldo da segunda conta R$" + segundaConta.saldo);

	
	
	if(primeiraConta == segundaConta ) {
		System.out.println("Mesmissíma conta");
	} else {
		System.out.println("Contas diferentes");
	}
	
	
	System.out.println(primeiraConta);
	System.out.println(segundaConta);

	
	
	
	
	
	}

}
