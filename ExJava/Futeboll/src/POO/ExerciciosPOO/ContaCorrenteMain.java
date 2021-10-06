package POO.ExerciciosPOO;

import Exercicios.main;

public class ContaCorrenteMain {

    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();
        conta.nome = "Vinicius";
        conta.conta = "124678";
        conta.agencia = "1111";
        conta.especial = true;
        conta.saldoConta = 50;


        System.out.println("Nome do proprietário da conta: " + conta.nome );
        System.out.println("Conta: " + conta.conta);
        System.out.println("Agência: " + conta.agencia);
        System.out.println("Saldo da conta: R$" + conta.saldoConta );
       


        
    }



    
}
