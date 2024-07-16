package UTN;

import UTN.conexion.Conexion;

public class Main {
    public static void main(String[] args) {
        var conexion = Conexion.getConnection();
        if(conexion != null)
            System.out.println("Te conectaste >3 "+conexion);
        else
            System.out.println("Ehrrrr error!");
    }//fin main
}// fin de clase