import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Pessoa vinicius = new Pessoa("Vinicius ", "111-111-111-11", 19);
		Pessoa carlos = new Pessoa("Carlos ", "222-222-222-22", 23);
		Pessoa joana = new Pessoa("Joana ","333-333-333-33", 31);
		
		ArrayList listaPessoas = new ArrayList();
		listaPessoas.add(vinicius);
		listaPessoas.add(carlos);
		listaPessoas.add(joana);
		
		System.out.println("Digite o cpf que deseja buscar");
		Scanner s = new Scanner(System.in);
		String cpfDigitado = s.nextLine();
		
		
		Pessoa p = new Pessoa(null, cpfDigitado, 0);
		
		
		if(listaPessoas.contains(p)) {
			System.out.println("Pessoa encontrada");
		} else {
			System.out.println("A pessoa do cpf digitado não se "
					+ " encontra na lista");
			
		}
		
	}
	
	
		
		
	}
	
	


