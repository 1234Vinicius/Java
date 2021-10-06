package Exercicios;

public class exemplos {

    public static void main(String[] args) {
        

        String mes[] = {"Jan", "Fev", "Mar", "Abri", "Mai", "Jun", "Jul", 
        "Ago", "Set", "Out", "Nov", "Dez"};

        int total[] = {31,28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for(int i = 0; i<mes.length; i++){
            System.out.println(mes[i] + " tem " + total[i] + " dia");
        }
    }
    
}
