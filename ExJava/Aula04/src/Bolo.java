
public class Bolo {
	
	String nomeBolo;
	int qtdIngrediente;
	String ingrediente;
	boolean forno;
	
	void saber() {
		if(this.forno == true) {
			System.out.println("O bolo est� no forno");
		} else 
			System.out.println("Coloque o bolo no forno");
	
		}
		
		void status() {
			System.out.println("O bolo � de: " + this.nomeBolo);
			System.out.println("A quantidade de ingredientes �: " + this.qtdIngrediente);
			System.out.println("Os ingredientes �: " + this.ingrediente);
			

		}
		void saberUm() {
			if(this.forno == true) {
				System.out.println("O bolo est� no forno");
			} else 
				System.out.println("Coloque o bolo no forno");
		
			}
	}
		
			
		


