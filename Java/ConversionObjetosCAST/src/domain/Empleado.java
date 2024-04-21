package domain;

public class Empleado {
    // atributos 2
    protected String nombre;
    protected double sueldo;

    // constructor publico de la clase padre
    public Empleado(String nombre, double sueldo) {
        // instancia de los atributos
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    // metodo para sobreescribir en la clasehija
    public String obtenerDetaller() {
        return "Nombre: " + this.nombre + ", Sueldo: " + this.sueldo;
    }

    // getter and setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + "]";
    }

}
