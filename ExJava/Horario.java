import java.util.Scanner;

public class Horario {
	
	

	public static void main(String[] args) {
		
		
		
		String nome;
		int anoAtual, anoNascimento, qtdAno;
		
		System.out.println("Entre com seu nome ");
		nome = new Scanner(System.in).nextLine();
		
		
		System.out.println("Entre com o ano atual");
		anoAtual = new Scanner(System.in).nextInt();
		
		System.out.println("Entre com a data de nascimento");
		anoNascimento = new Scanner(System.in).nextInt();
		
		qtdAno = anoAtual - anoNascimento;
		System.out.println(nome + " Em " + anoAtual + " Voc� faz (ou fez)" + qtdAno  + " anos");
		
		
		
		
		
		
		
		
	}
}

