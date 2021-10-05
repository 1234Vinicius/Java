package Composição;

public class Funcionario {

    private String nome;
    private double salario;
    private Endereco endereco;


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
       if(salario <0){
           this.salario = 0;
       } else {
           this.salario = salario;
       }

       
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
}
