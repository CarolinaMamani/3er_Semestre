package test;

import domain.Empleado;
import domain.Gerente;

public class TestInstanceOf {
    public static void main(String[] args) {
        // variables de la clase padre
        Empleado empleado1 = new Empleado("Juan", 100000);
        determinarTipo(empleado1);
        empleado1 = new Gerente("Jose", 5000, "Sistemas");
        determinarTipo(empleado1);
    }

    // InstanteOf, nos permite preguntar de que tipo es la refencia a la cual esta
    // apuntando cierta variable (empleado1)
    // instancia de cierto tipo
    public static void determinarTipo(Empleado empleado) { // con el metodo imprimir imprimimos datos de la clase padre
                                                           // e hija
        if (empleado instanceof Gerente) {
            System.out.println("Es de tipo Gerente");
            Gerente gerente = (Gerente) empleado; // covertimos a un tipo gerente
            gerente.getDepartamento();
        } else if (empleado instanceof Empleado) {
            System.out.println("Es de tipo Empleado");
        } else if (empleado instanceof Object) {
            System.out.println("Es de tipo Object");
        }
    }
}
