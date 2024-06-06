package excepciones;

//vamos a definir nuestra propia clase de excepcion
public class OperacionExcepcion extends RuntimeException {

    // constructor
    public OperacionExcepcion(String mensaje) {
        super(mensaje);

    }
}
