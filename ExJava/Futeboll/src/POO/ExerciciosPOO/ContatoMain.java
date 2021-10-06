package POO.ExerciciosPOO;

public class ContatoMain {

    public static void main(String[] args) {

        Contato contato = new Contato();
        contato.nome = "Vinicius";
        contato.endereco = "Av paulista, 1009";
        contato.email = "99887799vinicius@gmail.com";
        
        contato.telefones = new String[5];
        contato.telefones[0] = "999999999";
        contato.telefones[1] = "99999-9998";
        contato.telefones[2] = "98888-8888";
        contato.telefones[3] = "98888-8887";
        contato.telefones[4] = "98888-8886";


        

    }
    
}
