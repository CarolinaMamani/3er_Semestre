public class TestAutoboxingUnboxing {

    public static void main(String[] args) {
        // Clases envolventes o Wrapper
        /*
         * Clases envolventes de tipos primitivos:
         * Enteros int = la clase envolvente es Integer
         */
        int enteroPrimitivo = 10; // tipo primitivo comun y corriente, solo almacena un valor y no tiene ni
                                  // atributos ni metodos
        System.out.println("enteroPrimitivo = " + enteroPrimitivo);

        Integer entero = 10; // Tipo Object: usando la clase envolvente Integer, nos permite acceder a
                             // metodos/funciones
        // si no usamos calculos complejos, podemos usar Integer
        // Al recurrir al operador de punto tenemos acceso a los metodos
        System.out.println("entero = " + entero.toString()); // ahora 10 no es entero, sino una cadena
    }
}
