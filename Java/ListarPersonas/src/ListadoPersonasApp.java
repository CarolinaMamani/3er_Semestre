import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonasApp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //definimos la lista fuera del ciclo while
        List<Persona> personas = new ArrayList<>();
        //empezamos con el menu
        var salir = false;
        while (!salir){
            mostrarMenu();
            System.out.println();//un salto de linea
        }//fin de ciclo while
    }//fin del metodo main

    private static void mostrarMenu(){
        //mostramos las opciones
        System.out.print("""
                ******* LISTADO DE PERSONAS ********
                1. Agregar
                2. Listar
                3. Salir
                """);
        System.out.print("Que opcion queres >:3 ?   ");
    }
}