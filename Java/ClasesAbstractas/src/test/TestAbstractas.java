package test;

import domian.*;

public class TestAbstractas {
    public static void main(String[] args) {
        // aqui aplicamos el Upcasting:
        FiguraGeometrica figura = new Rectangulo("Rectangulo"); // atributo: Rectangulo
        figura.dibujar(); // aplicamos el polimorfismo
        // en tiempo de ejecucion se ejecuta el metodo de la clase hija
    }
}
