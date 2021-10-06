
public class ProjetoYoutube {
	
	
	public static void main(String[] args) {
		Video v[] = new  Video[3];
		v[0] = new Video ("Aula 1 de POO");
		v[1] = new Video ("Aula 2 de POO");
		v[2] = new Video ("Aula 10 de PHP");
		
		
		Gafanhoto g[] = new Gafanhoto[2];
		g[0] = new Gafanhoto("Jubileu", 19, "M", "Jubileu22");
		g[1] = new Gafanhoto("Creuza", 31, "F", "Creuza198");
		
		
		System.out.println(g[0].toString());
		System.out.println(g[1].toString());
		System.out.println(v[0].toString());
		System.out.println(v[1].toString());
		System.out.println(v[2].toString());
		
				
	}

}
