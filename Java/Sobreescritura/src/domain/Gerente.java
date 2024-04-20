package domain;

public class Gerente extends Empleado {
    private String departamento;

    // constructor, paramos parametros de la clase padre
    public Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);// llamado hacia el constructor de la clase padre
        this.departamento = departamento;
    }

}
