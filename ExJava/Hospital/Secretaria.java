package Hospital;

public class Secretaria extends Pessoa {

    
    protected String prontuario;

  

    @Override
    public void HorarioConsulta() {
       
    }

    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }
    
}
