import java.util.ArrayList;
import java.util.EmptyStackException;
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

            //para cualquier tipo de error que se pueda generar
            try{
                salir = ejecutarOperacion(entrada, personas);
            } catch (Exception e){
                System.out.println("ERROR!!: "+ e.getMessage());
            }

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
    }//fin de metodo mostrarMenu

    private static boolean ejecutarOperacion(Scanner entrada, List<Persona> personas){

    }//fin del metodo ejecutarOperacion

}//fin clase listadopersonas