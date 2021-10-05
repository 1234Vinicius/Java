package Composição;

public class Programa {

    public static void main(String[] args) {
        
        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();
        
        
        Endereco enderecoFuncionario1 = new Endereco("Limeira Andrade ", 444, " Bairro do minuto ", "São paulo", "SP ", " 03929010");
        Endereco enderecoFuncionario2 = new Endereco("Paulo Carneiro Maia ", 320, "Sem complemento", "São Paulo ", "SP ", "03929010"); 

        funcionario1.setEndereco(enderecoFuncionario1);
        funcionario2.setEndereco(enderecoFuncionario2);

        funcionario1.setNome("João");
        funcionario1.setSalario(2000.00);

        funcionario2.setNome("Leandro");
        funcionario2.setSalario(2000.00);

        System.out.println("O nome do funcionário1 é: " + funcionario1.getNome());
        System.out.println("O salário do funcionário1 é: R$" + funcionario1.getSalario());
        System.out.println("O endereço do funcionário1 é: " );
        System.out.println("Rua: " + funcionario1.getEndereco().getRua());
        System.out.println("Número: " + funcionario1.getEndereco().getNumero());
        System.out.println("Cidade: " + funcionario1.getEndereco().getCidade());
        System.out.println("Estado: " + funcionario1.getEndereco().getEstado());
        System.out.println("CEP: " + funcionario1.getEndereco().getCep());
        System.out.println("================================");

        System.out.println("O nome do funcionário2 é: " + funcionario2.getNome());
        System.out.println("O salário do funcionário2 é: R$" + funcionario2.getSalario());
        System.out.println("O endereço do funcionário2 é: " );
        System.out.println("Rua: " + funcionario2.getEndereco().getRua());
        System.out.println("Número: " + funcionario2.getEndereco().getNumero());
        System.out.println("Cidade: " + funcionario2.getEndereco().getCidade());
        System.out.println("Estado: " + funcionario2.getEndereco().getEstado());
        System.out.println("CEP: " + funcionario2.getEndereco().getCep());
        
        


    }
    
}
