package Hospital;

import java.util.Scanner;

public class main {

   
    public static void main(String[] args) {

        Paciente paciente = new Paciente();
       
        paciente.Pessoa = José da Silva Campos";
        paciente.CPF = "123.456-789-10";
        paciente.RG = "12-345-678-9";
        paciente.telefone = ("(11)999887799");
        paciente.dataConsulta = "12/10/2021"; 
        paciente.horarioConsulta = "14:00";
        paciente.especialidade = "Ortopedia ";
        paciente.status = "Agendado";
        paciente.statusPaciente();

        Medico medico = new Medico();
        medico.Pessoa = "Marcelo Perocco";
        medico.especialidade = Ortopedista
        medico.dataConsulta = paciente.dataConsulta;
        System.out.println("Você irá avaliar o paciente " + paciente.Pessoa + " no dia " + paciente.dataConsulta + " às " + paciente.horarioConsulta );
        medico.statusMedico();

        Secretaria secretaria = new Secretaria();
        System.out.println("Informações sobre a secretária:");
        System.out.println("Agendamento da consulta do paciente " + paciente.Pessoa);
        System.out.println("Data da consulta: " + paciente.dataConsulta);
        System.out.println("Horário da Consulta: " + paciente.horarioConsulta);
        System.out.println("Número para Contato:(11) 999887766");
        System.out.println("\n");
        System.out.println("=======================");;
        System.out.println("AVISO IMPORTANTE:");
        System.out.println("Caso não puder comparecer, cancelar à consulta em até 24h. ");
       
        
        
        




    }

    
}
