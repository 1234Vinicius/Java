
public class Conhecimento {
	
	
	public static void main(String[] args) {
		
		
		// Equals
		
		// Sempre que comparar duas variáveis do tipo primitivo 
		// se elas estiverem o mesmo valor, o == será true;
				
						
		// Exemplo: 
					
		int x = 10;
		int y = 10;
		System.out.println(x == y);
		
		
		
		String nome = "Vinicius";
		String nome1 = "Vinicius";
		String nome2 = new String("Vinicius");
		
		
		System.out.println(nome == nome1);  // True; 
		System.out.println(nome == nome2);   // False; Porque  nesse caso
		 // ele está comparando um endereço de memória, um objeto diferente
		 // então é por isso que ira dar false;  
		System.out.println(nome.equals(nome2)); //Usando o equals, nesse caso 
		 // vai dar True; 
		
		
						
		
		
		//Contains
		
		// Esse teste retornará true, porque dentro da String a, 
		//  existe o conteúdo da String b.
		
		
		String a = "um texto de exemplo";
		String b = "de exem";
		if (a.contains(b));
		System.out.println(a.contains(b));
		
		// Esse teste retornará false, porque dentro da String a, 
		//  não contém o conteúdo da String b.
		
		String c =  "testee";
		String d = "Hello";
		if(c.contains(d));
		System.out.println(c.contains(d));
		
		
		
		// Quando eu chamo o método indexOf 
		// Ele pega o índice onde está a minha String 
		// Ou seja, a String a da palavra banana 
		// está na posição 1
		String banana = "banana";
		System.out.println(banana.indexOf("a"));
		
		// No segundo exemplo, se eu pego uma letra que não
		// existe na minha frase, o resultado será -1 
		// eu peguei a letra x que não existe na palavra banana.
		
		// O resultado será -1;
		
		System.out.println(banana.indexOf("x"));
		
		
		// O comando lastIndexOf, pega a String do meu último caractere
		// sendo assim a letra "a", está no meu último índice(5);
		
		System.out.println(banana.lastIndexOf("a"));
		
		
		
		
		
		
		

		
		
		
	}

}
