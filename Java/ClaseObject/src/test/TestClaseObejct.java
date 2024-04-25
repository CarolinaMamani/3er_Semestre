package test;

import domain.*;

public class TestClaseObejct {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 10000);
        Empleado empleado2 = new Empleado("Juan", 10000);

        if (empleado1 == empleado2) {
            System.out.println("Tienen la misma referencia en memoria");
        } else {
            System.out.println("Tienen una distinta referencia en memoria");
        }

        // ---------
        if (empleado1.hashCode() == empleado2.hashCode()) {
            System.out.println("El valor hashCode es igual");
        } else {
            System.out.println("El valor hashCode es diferente");
        }
    }
}