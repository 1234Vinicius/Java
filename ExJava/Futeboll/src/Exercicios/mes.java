package Exercicios;

public class mes {

    public static void main(String[] args) {
        
        String mes[] = {"Janeiro", "Fevereiro" , "Março", "Abril", "Maio", "Junho", "Julho",
         "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

         int total[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

  
         
         System.out.println("Total de Arrays: " + mes.length);

         for(int i = 0; i<mes.length; i++){
             System.out.println(mes[i] + " tem " + total[i] + " dias");
         }

    }
    
}
