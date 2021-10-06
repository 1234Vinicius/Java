
public class Aula03 {
	
	public static void main(String[] args) {
		Bicicleta equipamento = new Bicicleta();
		
		equipamento.qtdPneus = 2;
		equipamento.aro = "Freio a disco";
		equipamento.roda = "Sua bicicleta tem duas rodas";
		equipamento.testaEquipamento();
		
		System.out.println(equipamento.qtdPneus);
		System.out.println(equipamento.aro);
		System.out.println(equipamento.roda);
		
		
		
	}

}
