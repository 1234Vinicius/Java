package ComposiçãoObjetos;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Cliente {

    private static SimpleDateFormat sdf = new  SimpleDateFormat("dd/MM/yyyy");

    private String name;
    private String email;
    private Date birthDate;


    public Cliente(){

    }

    public Cliente(String name, String email, java.util.Date date){
        this.name = name;
        this.email = email;
       

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
	public String toString() {
		return name + " (" + sdf.format(birthDate) + ") - " + email;
 	}

     public static SimpleDateFormat getSdf() {
         return sdf;
     }

     public static void setSdf(SimpleDateFormat sdf) {
         Cliente.sdf = sdf;
     }
    
}
