package domain;

public class Gerente extends Empleado {
    private String departamento;

    // constructor, paramos parametros de la clase padre
    public Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);// llamado hacia el constructor de la clase padre
        this.departamento = departamento;
    }

    // Sobre escribimos el metodo de la clase padre

    @Override // @ es un anotacion, modifica el comportamiento del metodo que esta definido
    // le indica que el metodo obtenerdetaller, esta siendo escrito desde la clase
    // padre
    public String obtenerDetaller() {
        // agregamos el atributo de departamento
        return super.obtenerDetaller() + ", Departamento: " + this.departamento;
    }
}
