package Livro;

public class Biblioteca implements LivroInterface {

    private String nomeLivro;
    private String nomePessoa;
    private String rg;
    private String cpf;
    private String dataEntrega;
    
    @Override
    public void leitor() {
        // TODO Auto-generated method stub
        
    }

    public void statusBiblioteca(){
        System.out.println("=================================");
        System.out.println("Nome do Livro: " + this.nomeLivro);
        System.out.println("Nome da Pessoa: " + this.nomePessoa);
        System.out.println("RG: " + this.rg);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Data de Entrega: " + this.dataEntrega);
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }


    
}
