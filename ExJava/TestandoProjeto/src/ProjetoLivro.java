
public class ProjetoLivro {
	
	public static void main(String[] args) {
		
		Pessoa [] p = new Pessoa[3];
		Livro  [] l = new Livro[2];
		
		p[0] = new Pessoa ("Vinicius", 19, "M");
		
		l[0] = new Livro("Poo para iniciantes", "Vinicius", 200, 0, false, p[0]);
		
		
		System.out.println(l[0].detalhes());
		
		
		
		
		p[0].fazerAniver();
		
		
		
	}
	
	
	

}
