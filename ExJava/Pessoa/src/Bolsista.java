
public class Bolsista extends Aluno{
	
	private float bolsa;
	
	
	public void renovarBolsa() {
		System.out.println("Renovando bolsa " + this.nome);
		
	}
	
	@Override
	public void  pagarMensalidade() {
		System.out.println(this.nome + " � bolsista! Pagamento facilitado");
		
		
	
	
	}

	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
	
	
	
	
	

}
