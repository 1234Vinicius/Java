

import javax.swing.JOptionPane;

public class numero {

    public static void main(String[] args) {

        String a = "";
        int ant = 0;
        int suc = 0;
        int num = 0;

        a = JOptionPane.showInputDialog("Entre com um número: ");
        num = Integer.parseInt(a);

        ant = num -1;
        suc = num +1;

        JOptionPane.showMessageDialog(null, "O antecessor de " + num + " é " + ant + " e seu sucessor é " + suc);
        
        




        
     


    }
    
}
