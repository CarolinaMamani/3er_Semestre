package accesodatos;

public class ImplementacionMysql implements IAccesoDatos {

    @Override // esta implementando porque los metodos estan vacios, asi que no se
              // sobreescriben
    public void actualizar() {
        System.out.println("Actualizar desde MySQL");

    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde MySQL");

    }

    @Override
    public void insertar() {
        System.out.println("Insertar desde MySQL");

    }

    @Override
    public void listar() {
        System.out.println("Listar desde MySQL");

    }

}
