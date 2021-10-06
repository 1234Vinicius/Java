package ContaBancaria;

import Hospital.main;

public class Teste {
    public static void main(String[] args) {
        
       System.out.println("**** CONTA BANCÁRIA ***");
        ContaBancaria contaSimples = new ContaBancaria();
        contaSimples.setNomeCliente("Vi");
        contaSimples.setNumConta("1111");

        contaSimples.deposita(1000);

        realizarSaque(contaSimples, 50);
        realizarSaque(contaSimples, 70);



        
         

        System.out.println(contaSimples);

    }

    private static void realizarSaque(ContaBancaria conta, double valor){

        if(conta.sacar(valor)){
            System.out.println("Saque realizado com sucesso, novo saldo = " + conta.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para saque de: R$" + valor + " saldo de R$" + conta.getSaldo());
        }

    }


    
}
