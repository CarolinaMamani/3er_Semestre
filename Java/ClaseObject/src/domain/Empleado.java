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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        long temp;
        temp = Double.doubleToLongBits(sueldo);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override // comparacion en contenido EQUALS
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Empleado other = (Empleado) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (Double.doubleToLongBits(sueldo) != Double.doubleToLongBits(other.sueldo))
            return false;
        return true;
    }

}
