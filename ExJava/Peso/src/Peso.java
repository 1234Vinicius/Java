import java.util.Scanner;

public class Peso {
	
	public static void main(String[] args) {
	
		
		float peso;
		
		System.out.println("Entre com o seu peso");
		peso = new Scanner(System.in).nextInt();
		
		
		if(peso >= 80) {
			System.out.println("Você está no peso médio");
		} else if (peso <40 ) {
			System.out.println("Peso baixo");
		} else {
			System.out.println("Peso rasoavel");
		}
		
		
		
		
		
	}
	
	


}
