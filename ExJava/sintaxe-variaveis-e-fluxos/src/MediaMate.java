import java.util.Scanner;

public class MediaMate {
	
	public static void main(String[] args) {
		
		
		String nome;
		double notaUm,notaDois, notaTres, notaQuatro, media;
		
		
		System.out.println("iNFORME SEU NOME");
		nome = new Scanner(System.in).nextLine();
		
		

		System.out.println("Informe a primeira nota");
		notaUm = new Scanner(System.in).nextInt();
		

		System.out.println("Informe a segunda nota");
		notaDois = new Scanner(System.in).nextInt();
		
		System.out.println("Informe a terceira nota");
		notaTres = new Scanner(System.in).nextInt();
		
		System.out.println("Informe a quarta nota");
		notaQuatro = new Scanner(System.in).nextInt();
		
		media = (notaUm + notaDois + notaTres + notaQuatro)/4;
		
		if(media >=5) {
			System.out.println("Ficou na média " + media);
		} else if(media >=6) {
			System.out.println("Aprovado" + media);
		} else {
			System.out.println("Reprovado" + media);
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
