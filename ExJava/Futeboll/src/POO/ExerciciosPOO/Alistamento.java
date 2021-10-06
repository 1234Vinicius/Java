package POO.ExerciciosPOO;

public class Alistamento {

    public static void main(String[] args) {

        int idade = 0;

        if(idade == 18){
            System.out.println("Você tem que se alistar");
        } else if(idade <=17 && idade>0){
            System.out.println("Você não precisa se alistar no momento");
        
        } else if(idade >18 && idade <=110){
        
        } else {
            System.out.println("Opção inválida, tente novamente.");
        }

        
    }
    
}
