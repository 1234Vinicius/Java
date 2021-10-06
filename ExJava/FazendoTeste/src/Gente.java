
public class Gente {
	public static void main(String[] args) {
	
		String frase = " 	isso é um espaço";
		System.out.println(frase);
		System.out.println(frase.trim());
		
		String ola = "olá";
		String mundo = "mundo";
		String olaMundo = ola.concat(mundo);
		
		String espaco = "I S P A Ç O";
		String semEspaco = espaco.replace("I", "E");
		System.out.println(semEspaco);
		
		semEspaco = semEspaco.replaceAll(" " , "");
		System.out.println(semEspaco);
		
		
		String mensagem = "isso é um teste";
		
		
		
		System.out.println(mensagem.substring(10));
		System.out.println(mensagem.substring(10,13));
		
				
		
		
		
		
		
	}
	
	
	
	
	
	

}
