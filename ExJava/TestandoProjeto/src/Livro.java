
public class Livro implements Publicacao{
	
	private String titulo;
	private String autor;
	private int totPaginas;
	private  int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	
	public String detalhes() {
		return "\nLivro [titulo=" + titulo + "\n, autor=" 
				+ autor + "\n, totPaginas=" + totPaginas 
				+ "\n, pagAtual=" + pagAtual
				+ "\n, aberto=" 
				+ aberto + "\n, leitor=" + leitor.getNome() + 
				"\n, idade=" + leitor.getIdade() +
				"\n, sexo=" + leitor.getSexo() +"[]";
		
				
			     
	}



	public Livro(String titulo, String autor, int totPaginas, int pagAtual, boolean aberto, Pessoa leitor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.aberto = false;
		this.pagAtual = 0;
		this.pagAtual = pagAtual;
		this.aberto = aberto;
		this.leitor = leitor;
	}



	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public String getAutor() {
		return autor;
	}



	public void setAutor(String autor) {
		this.autor = autor;
	}



	public int getTotPaginas() {
		return totPaginas;
	}



	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}



	public int getPagAtual() {
		return pagAtual;
	}



	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}



	public boolean getAberto() {
		return aberto;
	}



	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}



	public Pessoa getLeitor() {
		return leitor;
	}



	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}



	@Override
	public void abrir() {
		this.aberto = true;
		
		
	}



	@Override
	public void fechar() {
		this.aberto = false;
		
		
	}



	@Override
	public void folhear() {
		
	}



	@Override
	public void avancarPagina() {
		this.pagAtual++;
		
	}



	@Override
	public void voltarPagina() {
		this.pagAtual--;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
