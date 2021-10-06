package TestandoPrograma;

public class Endereco {

    private String nomeRua;
    private int numero;
    private String bairro;
    private String cidade;
    private String complemento;
    private String estado;
    private String cep;

    public Endereco(){

    }

    public Endereco(String nomeRua, int numero, String bairro, String cidade, String complemento,
    String estado, String cep){
    this.nomeRua = nomeRua;
    this.numero = numero;
    this.bairro = bairro;
    this.cidade = cidade;
    this.complemento = complemento;
    this.estado = estado;
    this.cep = cep;

    }

    public Endereco(String nomeRua, int numero, String bairro, String cidade, 
    String estado, String cep){
    this.nomeRua = nomeRua;
    this.numero = numero;
    this.bairro = bairro;
    this.cidade = cidade;
    this.estado = estado;
    this.cep = cep;

    }

    public String getNomeRua() {
        return nomeRua;
    }

    public void setNomeRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getComplemento() {
        return complemento;
    }
    
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }




    
}
