
public class Gente {
	public static void main(String[] args) {
	
		String frase = " 	isso � um espa�o";
		System.out.println(frase);
		System.out.println(frase.trim());
		
		String ola = "ol�";
		String mundo = "mundo";
		String olaMundo = ola.concat(mundo);
		
		String espaco = "I S P A � O";
		String semEspaco = espaco.replace("I", "E");
		System.out.println(semEspaco);
		
		semEspaco = semEspaco.replaceAll(" " , "");
		System.out.println(semEspaco);
		
		
		String mensagem = "isso � um teste";
		
		
		
		System.out.println(mensagem.substring(10));
		System.out.println(mensagem.substring(10,13));
		
				
		
		
		
		
		
	}
	
	
	
	
	
	

}
