package accesodatos.test;

import accesodatos.*;

public class TestInterfaces {
    public static void main(String[] args) {

        // Polimorfismo pero en Interfaces(comportamiento):

        IAccesoDatos datos = new ImplementacionMysql();
        // datos.listar();

        // imprimir(datos);

        datos = new ImplementacionOracle();
        // datos.listar();
        imprimir(datos);
    }

    // Metodo generico, recibe un tipo de interface que apunta tanto a mysql como
    // oracle
    public static void imprimir(IAccesoDatos datos) {
        datos.listar();
    }
}
