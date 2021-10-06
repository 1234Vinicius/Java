
public class Lutador {
	
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	public int empates;
	
	
	
	public void apresentar() {
		System.out.println("=====APRESENTAÇÃO=====");
		System.out.println("Chegou a hora apresentamos o Lutador: " + this.getNome());
		System.out.println("Diretamente da " + this.getNacionalidade());
		System.out.println("Com: " + this.getIdade() + " Anos");
		System.out.println("Com " + this.getAltura());
		System.out.println("Pesando " + this.getPeso() + "KG");
		System.out.println(this.getVitorias() + " Vitorias");
		System.out.println(this.getEmpates() + " Empates");
		System.out.println(this.getDerrotas() + " Derrotas");
		
	}
	
	public void status() {
		System.out.println(this.getNome() + "é um peso " + this.getCategoria());
		System.out.println("Ganhou " + this.getVitorias() + " Vezes");
		System.out.println("Perdeu " + this.getDerrotas() + " Vezes");
		System.out.println("Empatou " + this.getEmpates() + " Vezes");
		
		
	}
	
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}
	
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
		
		
	}
	
	public void empatarLuta() {
		this.setEmpates(this.getEmpates()+1);
		
	}

	
	

	public Lutador (String no, String na, int id, float al, float pe, int vi, int de,
			int em) {
		
		this.nome = no;
		this.nacionalidade = na;
		this.idade = id;
		this.altura = al;
		this.setPeso(pe);
		this.vitorias = vi;
		this.derrotas = de;
		this.empates = em;
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
		this.categoria = categoria;
	}
	
	
	
	public String getCategoria() {
		return categoria;
	
	}

	
	
	
	
	
	public void setCategoria(String categoria) {
	
		if(this.peso <52) {
		this.categoria = "Peso inválido";
	
	} else if(this.peso <=70.3) {
		this.categoria = "Peso leve";
	
	} else if(this.peso <=83.9) {
		this.categoria = "Peso médio";
	
	}else if(this.peso <=120.2) {
		this.categoria = "Peso pesado";
		
	} else {
		this.categoria = "Peso inválido";
	}
		
		
	}
	
	
	
	
	
	
	


	
	


	

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
	
	}


}
	
	