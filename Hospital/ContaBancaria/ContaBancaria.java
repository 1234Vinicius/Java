package ContaBancaria;

public class ContaBancaria {

    private String nomeCliente;
    private String numConta;
    private double saldo;





    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

        @Override
        public String toString() {
            String s = "Conta Bancária";
            s += " Nome Cliente: " + nomeCliente;
            s += " Número da Conta: " + numConta;
            s += " Saldo da Conta: " + saldo;
            s  += "|";

            return s;
        }

        public void deposita(double valor){
            saldo += valor;
        }

        public boolean sacar(double valor){
            if((saldo - valor) >=0){
                saldo -= valor;
                return true;
            }

            return false;
        }
    
}


