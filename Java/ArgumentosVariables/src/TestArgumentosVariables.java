public class TestArgumentosVariables {
    public static void main(String[] args) {

    }

    private static void imprimirNum(int... numeros) {// arreglo de tipo entero, los ... indica que la cantidad de
                                                     // elementos se desconoce
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elementos: " + numeros[i]);
        }
    }
}
