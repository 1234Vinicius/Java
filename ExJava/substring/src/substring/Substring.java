package substring;

import java.util.Scanner;

public class Substring {
	
	public static void main(String[] args) {
		
		/** Concat:
		 * � a mesma forma da concatena��o  */
		
		
		qualivida ingienopolis;
		
		
		
		
		
		
		
		
		
		
		
		rua s�o vicente de paulo, 463 santa cecilia
		
		
		String ola = "ol�";
		String mundo = " pessoas";
		String olaMundo = ola.concat(mundo);
		System.out.println(olaMundo);
	   
		
		
		/** Isso � um exemplo de replace. Ele vai substituir
		 * um caractere por outro  */
		
		
		
		String espaco = "I S P A � O";
		String semEspaco = espaco.replace("I", "E");
		System.out.println(semEspaco);
		
		semEspaco = semEspaco.replaceAll(" ", "");
		System.out.println(semEspaco);
		
		
		/** Isso � um exemplo de trim. Ele vai tirar os meus
		 * Espa�os indesejados  */
		
		String mensagem = "  Muito espa�o, n�: ";
		System.out.println(mensagem);
		System.out.println(mensagem.trim());
		
		
		String meses = "Janeiro,Fevereiro,Mar�o,Abril,Maio";
		String[] m�s = meses.split(",");
		for(int x = 0; x <m�s.length; x++) {
			System.out.println(m�s[x]);
			
		
		/** Isso � um exemplo de substring. Susbtring 
		 * � a metade de uma string, ou seja, eu posso pegar 
		 * partes de uma String usando a minha substring   */
			
		String minhaFrase = "Isso � um teste";
		System.out.println(minhaFrase.substring(2));
		System.out.println(minhaFrase);
		
		String testando = "Banana,ma��";
		String[] teste = testando.split(",");
		for(int i = 0;  i < teste.length; i++) {
			System.out.println(teste[i]);
		}
			
		}
		
		}
		
	
	}

	

	
			
		
		
	


