
public class GerenciamentoCarro {
	
	public static void main(String[] args) {
		 
		// Método Construtor Simples
		Carro c1 = new Carro();
		c1.setFabricante("VW");
		c1.setModelo("Fusca");
		c1.setAno(1977);
		c1.setMotorLigado(true);
		c1.setVelocidade(0);
		
		// Método Construtor Completo
		
		
		Carro c2 = new Carro("GT-ONE ", "Toyota ", 2010, false, 0);
		
		
		Carro c3 = new Carro("Chevolet ", "Opala", 1982);
		
		
		c1.detalhes();
		c2.detalhes();
		c3.detalhes();
		
		c1.situacaoMotor();
		c2.situacaoMotor();
		c3.situacaoMotor();
		
		System.out.println(c2.ligarMotor());
		
		
		
		
		
	}

}
