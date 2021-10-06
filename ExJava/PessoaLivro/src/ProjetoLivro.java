
public class ProjetoLivro {
	
	public static void main(String[] args) {
		
		
		
		
		
		
		Pessoa[] p = new Pessoa[2];
		Livro []  l = new Livro[3];
		
		
		p[0] = new  Pessoa("Vinicius " , 19, "M");
		p[1] = new  Pessoa("Maria " , 30, "F");
		
		l[0] = new Livro("Aprendendo Java", "José da Silva", 250, p[0]);
		l[1] = new Livro("POO para iniciantes ", "Maria de Andrade ", 250, p[1]);
		
		
		System.out.println(l[0].detalhes());
		
		
		l[0].abrir();
		
		l[0].folhear(100);
		l[0].avancarPagina();
		
		
		p[0].fazerAniver();
		
		
		
		
	
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
