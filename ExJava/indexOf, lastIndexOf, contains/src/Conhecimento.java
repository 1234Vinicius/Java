
public class Conhecimento {
	
	
	public static void main(String[] args) {
		
		
		// Equals
		
		// Sempre que comparar duas vari�veis do tipo primitivo 
		// se elas estiverem o mesmo valor, o == ser� true;
				
						
		// Exemplo: 
					
		int x = 10;
		int y = 10;
		System.out.println(x == y);
		
		
		
		String nome = "Vinicius";
		String nome1 = "Vinicius";
		String nome2 = new String("Vinicius");
		
		
		System.out.println(nome == nome1);  // True; 
		System.out.println(nome == nome2);   // False; Porque  nesse caso
		 // ele est� comparando um endere�o de mem�ria, um objeto diferente
		 // ent�o � por isso que ira dar false;  
		System.out.println(nome.equals(nome2)); //Usando o equals, nesse caso 
		 // vai dar True; 
		
		
						
		
		
		//Contains
		
		// Esse teste retornar� true, porque dentro da String a, 
		//  existe o conte�do da String b.
		
		
		String a = "um texto de exemplo";
		String b = "de exem";
		if (a.contains(b));
		System.out.println(a.contains(b));
		
		// Esse teste retornar� false, porque dentro da String a, 
		//  n�o cont�m o conte�do da String b.
		
		String c =  "testee";
		String d = "Hello";
		if(c.contains(d));
		System.out.println(c.contains(d));
		
		
		
		// Quando eu chamo o m�todo indexOf 
		// Ele pega o �ndice onde est� a minha String 
		// Ou seja, a String a da palavra banana 
		// est� na posi��o 1
		String banana = "banana";
		System.out.println(banana.indexOf("a"));
		
		// No segundo exemplo, se eu pego uma letra que n�o
		// existe na minha frase, o resultado ser� -1 
		// eu peguei a letra x que n�o existe na palavra banana.
		
		// O resultado ser� -1;
		
		System.out.println(banana.indexOf("x"));
		
		
		// O comando lastIndexOf, pega a String do meu �ltimo caractere
		// sendo assim a letra "a", est� no meu �ltimo �ndice(5);
		
		System.out.println(banana.lastIndexOf("a"));
		
		
		
		
		
		
		

		
		
		
	}

}
