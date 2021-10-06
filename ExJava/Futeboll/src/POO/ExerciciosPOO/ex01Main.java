package POO.ExerciciosPOO;

public class ex01Main {

    public static void main(String[] args) {
        
        Ex01 lampada = new Ex01();
        lampada.modelo = "A60";
        lampada.tensão = "Bivolt";
        lampada.garantiaMes = 36;
        lampada.potencia = 7;
        lampada.cor = "Amarela";
        lampada.tipoLuz = "Amarela";
        lampada.tipoAbaju = true;

        lampada.tipos = new String [5];
        lampada.tipos[0] = "Abaju";
        lampada.tipos[1] = "Lampeões";


        System.out.println(lampada.modelo);
        System.out.println(lampada.tensão);
        System.out.println(lampada.garantiaMes);
        System.out.println(lampada.potencia);
        System.out.println(lampada.cor);
        System.out.println(lampada.tipoLuz);
        System.out.println(lampada.tipoAbaju);
        System.out.println(lampada.tipos[0]);
        System.out.println(lampada.tipos[1]);

        System.out.println("=============================");
        System.out.println("Suas informações foram salvas:");
        System.out.println("Modelo: " + lampada.modelo);
        System.out.println("Tensão: " + lampada.tensão);
        System.out.println("Garantia:  " + lampada.garantiaMes);
        System.out.println("Potencia: " + lampada.potencia);
        System.out.println("Cor: " + lampada.cor);
        System.out.println("Tipo de Luz: " + lampada.tipoLuz);
        System.out.println("Tipo de Abaju: " + lampada.tipoAbaju);
        System.out.println("Tipos: " + lampada.tipos[0]);
        System.out.println("Tipos: " + lampada.tipos[1]);
        
        
        
        
        



    }
    
}
