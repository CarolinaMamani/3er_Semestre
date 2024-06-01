package accesodatos.test;

import accesodatos.*;

public class TestInterfaces {
    public static void main(String[] args) {
        IAccesoDatos datos = new ImplementacionMysql();
        datos.listar();
    }
}
