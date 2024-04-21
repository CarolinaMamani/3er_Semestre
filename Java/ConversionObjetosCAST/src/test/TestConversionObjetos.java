package test;

import domain.*;

public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado; // declaramos la variable
        // a la variable empleado apuntamos a la clase hija
        // podemos asignar objetos de clases hijas asia tipos de clase padre
        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO); // apuntamos a la clase hija
        System.out.println("empleado = " + empleado);
        System.out.println(empleado.obtenerDetaller());// siqueremos acceder a metdos Escritor

        // Downscasting
        // ((Escritor)empleado).gettipoEscritura(); //tenemos 2 opciones: esta es una

        Escritor escritor = (Escritor) empleado; // esta esl a segunda opcion

        escritor.getTipoEscritura();

        // Upcasting
        Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerDetaller());
    }
}
