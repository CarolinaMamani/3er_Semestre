package test;

import domain.*;

public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado; // declaramos la variable
        // a la variable empleado apuntamos a la clase hija
        // podemos asignar objetos de clases hijas asia tipos de clase padre
        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO); // apuntamos a la clase hija
        // System.out.println("empleado = " + empleado);
        System.out.println(empleado.obtenerDetaller());// siqueremos acceder a metdos de la clase Escritor

        // empleado.getTipoEscritura(); //no podemos acceder al metodo get de la clase
        // escritor. Este metodo no esta definido en la clase empleado

        // Downscasting: al objeto padre Empleado lo casteamos hacia la clase hija
        // Escritor

        // ((Escritor)empleado).getTipoEscritura(); //tenemos 2 opciones: esta es una
        // Segunda opcion:
        Escritor escritor = (Escritor) empleado;
        escritor.getTipoEscritura();
        // esta sixtasis convierte a un tipo Padre a un tipo Hijo
        // no se hace de manera automatica

        Escritor escritor = (Escritor) empleado; // esta esl a segunda opcion

        escritor.getTipoEscritura();

        // Upcasting:
        // se hace de manera automatica
        Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerDetaller());
    }
}
