package domain;

//JAVA BEANS

import java.io.Serializable;

public class Persona implements Serializable {

    // atributos de tipo private
    private String nombre;
    private String apellido;

    // constructor vacio (obligatorio para que sea java beans)
    public Persona() {

    }

    // no es requerido, pero se puede poner otro constructor con parametros:
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // getters and setters obligatorios
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellido=" + apellido + "]";
    }

}
