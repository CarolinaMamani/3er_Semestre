public class TestAutoboxingUnboxing {

    public static void main(String[] args) {
        // Clases envolventes o Wrapper
        /*
         * Clases envolventes de tipos primitivos:
         * Enteros int = la clase envolvente es Integer
         * long = la clase envolvente es Long
         * float = clase envolvente Float
         * double = clase envolvente Double
         * boolean = clase envolvente Boolean
         * byte = clase envolvente Byte
         * char = clase envolvente Character
         * short = clase envolvente Short
         */
        int enteroPrimitivo = 10; // tipo primitivo comun y corriente, solo almacena un valor y no tiene ni
                                  // atributos ni metodos
        System.out.println("enteroPrimitivo = " + enteroPrimitivo);

        Integer entero = 10; // Tipo Object: usando la clase envolvente Integer, nos permite acceder a
                             // metodos/funciones
        // si no usamos calculos complejos, podemos usar Integer
        // Al recurrir al operador de punto tenemos acceso a los metodos
        System.out.println("entero = " + entero.doubleValue()); // AUTOBOXING: covertimos el entero en un doble
        // ahora 10 no es entero, sino una cadena

        int entero2 = entero; // UNBOXING
        // se extrae el valor del objeto y se lo asignamos a la variable primitiva
        // entero 2
        // ahora ya no es un objeto, es un tipo primitivo
        System.out.println("entero2 = " + entero2);

    }
}
