public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirNum(3, 4, 5); // nuestro metodo y agregamos numeros
        imprimirNum(1, 2);
        variosParametros("Ren-sama ", "Kawashiri ", "27 ", 3, 7);
    }

    // definir metodos
    private static void variosParametros(String nombre, String apellido, String edad, int... numeros) { // siempre al
                                                                                                        // final los
        // argumentos variables
        System.out.println("Nombre: " + nombre + "Apellido: " + apellido + "Edad: " + edad);
        imprimirNum(numeros);
    }

    private static void imprimirNum(int... numeros) {// arreglo de tipo entero, los ... indica que la cantidad de
                                                     // elementos se desconoce
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elementos: " + numeros[i]);
        }
    }
}
