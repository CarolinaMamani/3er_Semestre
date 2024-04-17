import domain.Persona;

public class TestForEach {
    public static void main(String[] args) {
        // for each es un ciclo for, mejorado
        // el arreglo debe estar especificado, ej int
        int edades[] = { 5, 6, 9, 8 };// arreglo de tipo entero con 4 elementos

        // sintaxis del ForEach
        // definimos una variable que almacena cada uno de los valores
        // la variable debe coincidir con los valores del arreglo
        // int edades = int edad
        for (int edad : edades) {// es un ciclo simplicado, no hay un contador,
            // no se puede acceder al indice con un foreach
            System.out.println("edad= " + edad);
        }

        // arreglo
        Persona personas[] = { new Persona("Nyo"), new Persona("Lumi"), new Persona("Iyo") };

        // Foreach
        for (Persona persona : personas) {
            System.out.println("persona = " + persona);
        }
    }
}
