package test;

import domain.Empleado;
import domain.Gerente;

public class TestSobrescritura {
    public static void main(String[] args) {
        // variables de la clase padre
        Empleado empleado1 = new Empleado("Juan", 100000);
        imprimir(empleado1);

        // System.out.println("empleado1 = " + empleado1.obtenerDetaller());

        // objeto de tipo gerente
        empleado1 = new Gerente("Jose", 5000, "Sistemas");
        imprimir(empleado1);
        // System.out.println("gerente1 = " + gerente1.obtenerDetaller());
    }

    // Polimorfismo, sucecede en ele momento de la ejecucion. Para obervar hacer un
    // Debug
    public static void imprimir(Empleado empleado) { // con el metodo imprimir imprimimos datos de la clase padre e hija
        String detalles = empleado.obtenerDetaller();
        System.out.println("detalles = " + detalles);
    }
}
