public class Escritor {
    final tipoEscritura tipoEscritura;

    public Escritor(String nombre, double sueldo, tipoEscritura tipoEscritura) {
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }

    // metodo para sobreescribir
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles()+', Tipo Escritura: '+tipoEscritura.getDescription();
    }

    @Override
    public String toString() {
        return "Escritor {" + "tipoEscrotura= " + tipoEscritura + '}' + ' ' + super.toString();
    }

    public tipoEscritura gettipoEscritura() {
        return this.tipoEscritura;
    }
}
