
public class Pessoa {
	
	public static void main(String[] args) {
		
		String Concatena��o = "+";
		String trim = "espaco";
		String replace = "Substitui letra";
		String substring = "metade da String";
		
		String ola = "ol�";
		String mundo = " mundo";
		String olaMundo = ola.concat(mundo);
		System.out.println(olaMundo);
		
		
		String nome = " Me chamo Vinicius: ";
		System.out.println(nome);]
		System.out.println(nome.trim());
		
		String espaco = "I S P A � O: ";
		String semEspaco = espaco.replace("I", "E");
		System.out.println(semEspaco);
		semEspaco = semEspaco.replaceAll(" ", "");
		System.out.println(semEspaco);
		
		
		String frase = "Isso � um teste";
		System.out.println(frase.substring(10));
		System.out.println(frase.substring(10, 14));
		System.out.println(frase);
		
		
		
		
		
	}
	
	


}
