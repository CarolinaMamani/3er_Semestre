package domain;

public class Escritor extends Empleado {
    final TipoEscritura tipoEscritura;

    // constructor
    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura) {
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }

    // metodo para sobreescribir
    @Override
    public String obtenerDetaller() {
        return super.obtenerDetaller() + ", Tipo Escritura: " + tipoEscritura.getDescripcion();
    }

    @Override // para sobre escribir el metodo tostring
    public String toString() {
        return "Escritor {" + "tipoEscrotura= " + tipoEscritura + '}' + " " + super.toString();
    }

    // get para obtener el valor de tipo escritura
    public TipoEscritura getTipoEscritura() {
        return this.tipoEscritura;
    }
}
