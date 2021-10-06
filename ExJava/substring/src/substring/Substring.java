package substring;

import java.util.Scanner;

public class Substring {
	
	public static void main(String[] args) {
		
		/** Concat:
		 * É a mesma forma da concatenação  */
		
		
		qualivida ingienopolis;
		
		
		
		
		
		
		
		
		
		
		
		rua são vicente de paulo, 463 santa cecilia
		
		
		String ola = "olá";
		String mundo = " pessoas";
		String olaMundo = ola.concat(mundo);
		System.out.println(olaMundo);
	   
		
		
		/** Isso é um exemplo de replace. Ele vai substituir
		 * um caractere por outro  */
		
		
		
		String espaco = "I S P A Ç O";
		String semEspaco = espaco.replace("I", "E");
		System.out.println(semEspaco);
		
		semEspaco = semEspaco.replaceAll(" ", "");
		System.out.println(semEspaco);
		
		
		/** Isso é um exemplo de trim. Ele vai tirar os meus
		 * Espaços indesejados  */
		
		String mensagem = "  Muito espaço, né: ";
		System.out.println(mensagem);
		System.out.println(mensagem.trim());
		
		
		String meses = "Janeiro,Fevereiro,Março,Abril,Maio";
		String[] mês = meses.split(",");
		for(int x = 0; x <mês.length; x++) {
			System.out.println(mês[x]);
			
		
		/** Isso é um exemplo de substring. Susbtring 
		 * é a metade de uma string, ou seja, eu posso pegar 
		 * partes de uma String usando a minha substring   */
			
		String minhaFrase = "Isso é um teste";
		System.out.println(minhaFrase.substring(2));
		System.out.println(minhaFrase);
		
		String testando = "Banana,maçã";
		String[] teste = testando.split(",");
		for(int i = 0;  i < teste.length; i++) {
			System.out.println(teste[i]);
		}
			
		}
		
		}
		
	
	}

	

	
			
		
		
	


