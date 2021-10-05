package Hospital;

public abstract class Pessoa {

    public static void main(String[] args) {
        
    }

   protected String Pessoa;
   protected String RG;
   protected String CPF;
   protected int idade;
   protected String telefone;
   protected String especialidade;
   protected String dataConsulta;
   protected String horarioConsulta;
   protected String status;


   public abstract void HorarioConsulta ();
   

   public void statusPaciente(){
       System.out.println("============================");
       System.out.println("Informações sobre o paciente:");
       System.out.println("Nome: " + this.Pessoa);
       System.out.println("CPF: " + this.CPF);
       System.out.println("RG: " + this.RG);
       System.out.println("Telefone: " + this.telefone);
       System.out.println("Consulta no dia: " + this.dataConsulta );
       System.out.println("Horário: " + this.horarioConsulta);
       System.out.println("Status da Consulta: " + this.status);
      
       System.out.println("============================");
   }


   public void statusMedico(){
    
    System.out.println("Informações sobre o Médico: ");
    System.out.println("Nome: " + this.Pessoa);
    System.out.println("Especialidade: " + this.especialidade);
    System.out.println("============================");

   }

  public void statusSecretaria(){
    System.out.println("============================");
    
  }

   public String getPessoa() {
       return Pessoa;
  
  }

   public void setPessoa(String pessoa) {
       Pessoa = pessoa;
  }

   public String getRG() {
       return RG;
  }

   public void setRG(String rG) {
       RG = rG;
  }

   public String getCPF() {
       return CPF;
  }

   public void setCPF(String cPF) {
       CPF = cPF;
  }

   public int getIdade() {
       return idade;
  }

   public void setIdade(int idade) {
       this.idade = idade;
  }

   public String getTelefone() {
       return telefone;
  }

   public void setTelefone(String telefone) {
       this.telefone = telefone;
   }
    

   public String getEspecialidade() {
       return especialidade;
   }

   public void setEspecialidade(String especialidade) {
       this.especialidade = especialidade;
   }

   public String getDataConsulta() {
       return dataConsulta;
   }

   public void setDataConsulta(String dataConsulta) {
       this.dataConsulta = dataConsulta;
   }

   public String getStatus() {
       return status;
   }

   public void setStatus(String status) {
       this.status = status;
   }

   public String getHorarioConsulta() {
       return horarioConsulta;
   }

   public void setHorarioConsulta(String horarioConsulta) {
       this.horarioConsulta = horarioConsulta;
   }

   
       
   }

