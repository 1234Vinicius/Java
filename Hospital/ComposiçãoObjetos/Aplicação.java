package ComposiçãoObjetos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import java.util.Scanner;

public class Aplicação {



    


    public static void main(String[] args) throws ParseException {

         SimpleDateFormat sdf = new  SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        
        Cliente cliente = new Cliente("Maria","maria@gmail.com", sdf.parse("20/05/2002"));
        System.out.println(cliente);
        scan.close();

    }
    
}
