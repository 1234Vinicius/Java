
public class Tv {
	
	
	private String marcaDaTv;
	private String corDatv;
	private String trocandoCanais;
	private boolean tvLigada;
	
	
	
	public void status() {
		System.out.println("===== TV =====");
		System.out.println("Marca da TV: " + this.getMarcaDaTv());
		System.out.println("Cor da TV: " + this.corDatv);
		System.out.println("O canal que está agora: " + this.getTrocandoCanais());
		System.out.println("A tv está ligada: " + this.tvLigada);
		System.out.println("\n");
	}
	
	
	
	
	
	public Tv() {
		super();
	}
	
	
	
	





	public Tv(String marcaDaTv, String corDatv, String trocandoCanais, boolean tvLigada) {
		super();
		this.marcaDaTv = marcaDaTv;
		this.corDatv = corDatv;
		this.trocandoCanais = trocandoCanais;
		this.tvLigada = tvLigada;
	}





	public String getTrocandoCanais() {
		return trocandoCanais;
	}
	public void setTrocandoCanais(String trocandoCanais) {
		this.trocandoCanais = trocandoCanais;
	}
	public boolean isTvLigada() {
		return tvLigada;
	}
	public void setTvLigada(boolean tvLigada) {
		this.tvLigada = tvLigada;
	}
	
	
	
	
	
	
	public String getMarcaDaTv() {
		return marcaDaTv;
	}





	public void setMarcaDaTv(String marcaDaTv) {
		this.marcaDaTv = marcaDaTv;
	}





	public String getCorDatv() {
		return corDatv;
	}





	public void setCorDatv(String corDatv) {
		this.corDatv = corDatv;
	}





	public Tv(String marcaDaTv, String corDatv) {
		super();
		this.marcaDaTv = marcaDaTv;
		this.corDatv = corDatv;
	}





	public void tvTocando() {
		if(this.tvLigada == true) {
			System.out.println("A tv está ligada");
		} else {
			System.out.println("A tv está desligada");
		}
		
	}
	
	}
	
	
	
	
	
	
	
	
	


