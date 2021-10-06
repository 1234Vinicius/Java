
public class Aula05 {
	
	public static void main(String[] args) {
		
		Bolo fornoo = new Bolo();
		fornoo.qtdIngrediente = 4;
		fornoo.ingrediente = "Leite, manteiga, ovos, fermento";
		fornoo.nomeBolo = "milho";
		fornoo.forno = true;
		
		
		fornoo.saber();
		fornoo.status();
		
		Bolo fornoUm = new Bolo();
		fornoUm.nomeBolo = "Bolo de fuba";
		fornoUm.ingrediente = "Ovos, leite";
		fornoUm.qtdIngrediente = 6;
		fornoUm.forno = false;
		
		fornoUm.saberUm();
		
		System.out.println(fornoUm.nomeBolo);
		System.out.println(fornoUm.qtdIngrediente);
		System.out.println(fornoUm.ingrediente);
		
		
		
		
		
	}
	
	

}
