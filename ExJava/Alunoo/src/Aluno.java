import java.util.Scanner;

public class Aluno {
	
	
public static void main(String[] args) {
		
		String nome;
		int notaUm;
		int notaDois;
		int notaTres;
		int notaQuatro;
		
		int media = 5;
		
		
		System.out.println("Olá aluno! Digite seu nome: ");
		nome = new Scanner(System.in).nextLine();
		
		
		System.out.println("Digite sua primeira nota: ");
		notaUm = new Scanner(System.in).nextInt();
		
		System.out.println("Digite sua segunda nota: ");
		notaDois = new Scanner(System.in).nextInt();
		
		System.out.println("Digite sua terceira nota: ");
		notaTres = new Scanner(System.in).nextInt();
		
		System.out.println("Digite sua quarta nota: ");
		notaQuatro = new Scanner(System.in).nextInt();
		
		media = (notaUm + notaDois + notaTres + notaQuatro)/4;
		
		
		if(media >=5 ) {
			System.out.println(nome + " Parabéns! Você passou de ano sua média "
					+ "foi de " + media);
		} else if(media <5) {
			System.out.println(nome  + " Você foi reprovado a sua nota foi "
					+ media);
		} else {
			System.out.println(nome + " Parabéns! Você passou de ano com nota " + media );
		}
		
		
		
			System.out.println("TESTANO");
		
		
	}
	
	

}
