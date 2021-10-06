
public class Jogadores {
	
	public String jogador;
	public String nacionalidade;
	public int qtdJogadores;
	public String estadio;
	
	
	public void resultado() {
		System.out.println("Jogador: " + this.getJogador());
		System.out.println("Nacionalidade: " + this.getNacionalidade());
		System.out.println("Quantidade de jogadores: " + this.qtdJogadores);
		System.out.println("Estádio: " + this.getEstadio());
	}
	
	
	public String getJogador() {
		return jogador;
	}
	
	public void setJogador(String jogador) {
		this.jogador = jogador;
	
	}
	
	public String getNacionalidade() {
		return nacionalidade;
	
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	
	}
	public int getQtdJogadores() {
		return qtdJogadores;
	}
	public void setQtdJogadores(int qtdJogadores) {
		this.qtdJogadores = qtdJogadores;
	
	}
	public String getEstadio() {
		return estadio;
	}
	public void setEstadio(String estadio) {
		this.estadio = estadio;
	}
	
	
	
	
	

}
