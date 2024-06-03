package aritmetica;

import javax.management.openmbean.OpenDataException;

public class Aritmetica {

    // Metodo
    public static int division(int numerador, int denominador) throws OpenDataException {
        // preguntamos si el denominador es = 0
        if (denominador == 0) {
            throw new OpenDataException("Division entre cero");
        }
        return numerador / denominador;
    }
}
