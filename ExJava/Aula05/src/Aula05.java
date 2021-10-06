
public class Aula05 {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.setnomePessoa("Vinicius");
		p1.setidadePessoa(19);
		p1.setCor("Azul");
		p1.temFihos = true;
		p1.saber();
		
		p1.status();
		
		Pessoa p2 = new Pessoa();
		p2.nomePessoa = "Carlos";
		p2.setidadePessoa(13);
		p2.setCor("Verde");
		p2.temFihos = false;
		p2.saber();
		
		p2.status();
		
		Pessoa p3 = new Pessoa();
		p3.nomePessoa = "José";
		p3.setidadePessoa(29);
		p3.setCor("Amarelo");
		p3.temFihos = true;
		p3.status();
		
		p3.status();
		
		
	}

}
