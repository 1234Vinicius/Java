
public class Lutador {

	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categorias;
	private int vitorias;
	private int derrotas;
	private int empates;

	public void apresentar() {
		System.out.println("CHEGOU A HORA! Apresentamos o lutador " + this.getNome());
		System.out.println("Origem: " + this.getNacionalidade());
		System.out.println(this.getIdade() + " Anos");
		System.out.println(this.getAltura() + " Altura");
		System.out.println("Pesando " + this.getPeso() + " KG");
		System.out.println("Ganhou: " + this.getVitorias() + " Partidas");
		System.out.println("Perdeu: " + this.getDerrotas() + " Partidas");
		System.out.println("Empatou: " + this.getEmpates() + " Partidas");

	}

	public void status() {
		System.out.println(this.getNome());
		System.out.println("� um peso " + this.getCategorias());
		System.out.println(this.getVitorias() + "Vit�rias");
		System.out.println(this.getEmpates() + "Empates");
		System.out.println(this.getDerrotas() + "Derrotas");

	}

	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);

	}

	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);

	}

	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);

	}

	public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
		super();
		this.nome = no;
		this.nacionalidade = na;
		this.idade = id;
		this.altura = al;
		this.peso = pe;
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

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategorias();
	}

	public String getCategorias() {
		return categorias;
	}

	public void setCategorias() {
		if (this.peso < 52.2) {
			this.categorias = "Inv�lido";
		} else if (this.peso <= 70.3) {
			this.categorias = "Peso leve";
		} else if (this.peso <= 83.9) {
			this.categorias = "Peso leve";
		} else if (this.peso <= 120.2) {
			this.categorias = "Peso pesado";
		} else {
			this.categorias = "Inv�lido";
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
		this.empates = empates;
	}

	static class LutadorBuilder {

		private String nome;
		private String nacionalidade;
		private int idade;
		float altura;
		private float peso;
		private String categorias;
		private int vitorias;
		private int derrotas;
		private int empates;

		public LutadorBuilder nome(String value) {
			this.nome = value;
			return this;

		}

		public LutadorBuilder nacionalidade(String value) {
			this.nome = value;
			return this;
		}

		public LutadorBuilder idade(int value) {
			this.idade = value;
			return this;

		}

		public LutadorBuilder peso(float value) {
			this.peso = value;
			return this;

		}

		public LutadorBuilder altura(float value) {
			this.altura = value;
			return this;

		}

		public LutadorBuilder vitorias(int value) {
			this.vitorias = value;
			return this;

		}

		public LutadorBuilder derrotas(int value) {
			this.derrotas = value;
			return this;
		}

		public LutadorBuilder empates(int value) {
			this.empates = value;
			return this;
		}

		public Lutador build() {
			return new Lutador(this.nome, this.nacionalidade, this.idade, 
					this.altura, this.peso,this.vitorias,this.derrotas,this.empates);
			
		}

	}

	public static LutadorBuilder newObj() {
		return new LutadorBuilder();

	}
}
