package aritmetica;

import excepciones.OperacionExcepcion;

public class Aritmetica {

    // Metodo
    public static int division(int numerador, int denominador) {
        // preguntamos si el denominador es = 0
        if (denominador == 0) {
            throw new OperacionExcepcion("Division entre cero");
        }
        return numerador / denominador;
    }
}
