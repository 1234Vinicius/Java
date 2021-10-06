
public class Main {
	
	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.setModeloCaneta("BIC");
		c1.setCorDaCaneta("Azul");
		c1.setTampada(false);
		
		c1.destampada();
		
		c1.status();
	}

}
