
public class carro {
	
	public static void main(String[] args) {
		System.out.println("=============");
		Testando carro = new Testando();
		carro.setCarro("Corsa");
		carro.setAnoCarro(1995);
		carro.setModeloCarro("Chevrolet");
		carro.setFunciona(true);
		carro.status();
		System.out.println("=============");
		
		
		Testando carro2 = new Testando();
		carro2.setCarro("Opala"); 
		carro2.setAnoCarro(2015);
		carro2.setModeloCarro("Gol");
		carro2.setFunciona(false);
		carro2.status();
		
		
	}

}
