
public class Contaum {
	
	double saldo;
	String titular;
	int agência;
	float conta;
	
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
		
	}
	
	public boolean sacar(double valor) {
		if(this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}
		
		
	}
	
	public  boolean transfere(double valor, Contaum destino) {
		if(this.saldo >=valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
			return false;
		}
		
		
	}

	




	






