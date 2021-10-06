
public class main {
	
	public static void main(String[] args) {
	
	
		
		String ola = "olá";
		String mundo = " mundo";
		String olaMundo = ola.concat(mundo);
		System.out.println(olaMundo);
		
		
		String nome =  " Meu nome é : ";
		System.out.println(nome);
		System.out.println(nome.trim());
		
		String espaco = "I S P A Ç O";
		String semEspacos = espaco.replace("I", "E");
		System.out.println(semEspacos);
		
		semEspacos = semEspacos.replaceAll(" ", "");
		System.out.println(semEspacos);
		
		
		
		
		
		
		
		
		String teste = "isso é um teste final ok.";
		
		System.out.println(teste);
		System.out.println(teste.substring(10));
		System.out.println(teste.substring(10, 24));
		
		
		
		
		
		
		
		
	


}
	
}
