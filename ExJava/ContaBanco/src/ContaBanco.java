
public class ContaBanco {
	
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	
	
	
	public void estadoAtual() {
		System.out.println("N�mero da conta: " + this.getNumConta());
		System.out.println("Tipo da conta: " + this.getTipo());
		System.out.println("Dono " + this.getDono());
		System.out.println("Saldo " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}
	
	
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t == "CC") {
			this.setSaldo(50);
			
		} else if(t == "CP"){
			this.setSaldo(150);

		}
		
		System.out.println("Conta aberta com sucesso");
		
		
	}
	
	public void fecharConta() {
		
		if(this.getSaldo() >0) {
			System.out.println("Voc� ainda tem dinheiro na sua conta");
		} else if(this.getSaldo() <0) {
			System.out.println("O seu saldo est� negativo n�o tem como fechar sua conta");
		} else {
		this.setStatus(false);
		System.out.println("Conta fechada com sucesso");
	
	}
	}
	
	public void depositar(float v) {
		if(this.getStatus()) {
			this.setSaldo(getSaldo() + v);
			System.out.println("Deposito realizado com sucesso na conta " + this.getDono());
			
			
		} else {
			System.out.println("Imposs�vel depositar em uma conta fechada");
		}

}
	
	public void sacar(float v) {
		if(this.getStatus()) {
			if(this.getSaldo() >=v) {
				this.setSaldo(this.getSaldo()-v);
				System.out.println("Saque realizado na conta " + this.getDono());
			} else {
				System.out.println("Imposs�vel sacar de uma conta fechada");
			}
		}
		
	}
	
	public void pagarMensal() {
		
		int v = 0;
		if(this.getTipo() == "CC") {
			v = 12;
			
		} else if(this.getTipo() == "CP") {
			v = 20;
		}
		
		if(this.getStatus()) {
			this.setSaldo(this.getSaldo()-v);
			System.out.println("Fatura paga com sucesso");
			
			
		} else {
			System.out.println("Imposs�vel pagar uma conta fechada");
		}
		
		
	}
	
	public void contaBanco() {
		this.saldo = 0;
		this.status = false;
		
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
		
	}
	

