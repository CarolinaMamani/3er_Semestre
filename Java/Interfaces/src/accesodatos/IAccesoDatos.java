package accesodatos;

public interface IAccesoDatos { // interface no hereda de la clase Object

    // cualquier atributo en una interface necesita si o si su valor. Ya que no
    // tiene constructor y todos los metodos son abstractos

    int MAX_REGISTRO = 10; // es una constante, es public, abstracto, final y static

    // Metodo insertar es abstracto y sin cuerpo
    void insertar();

    void listar();

    void actualizar();

    void eliminar();

}
