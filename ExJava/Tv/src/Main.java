
public class Main {
	
	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.setMarcaDaTv("Samsung");
		tv.setCorDatv("Preta");
		tv.setTrocandoCanais("Globo");
		tv.setTvLigada(false);
		tv.status();
		tv.tvTocando();
		
		Tv tv1 = new Tv("LG ", " Preta ", "SBT", false);
		tv1.status();
		tv1.tvTocando();
		
		
		Tv tv2 = new Tv();
		tv2.setMarcaDaTv("Philco");
		tv2.setCorDatv("Branca");
		tv2.setTrocandoCanais("Record");
		tv2.setTvLigada(true);
		tv2.status();
		tv2.tvTocando();
		
		
	}

}
