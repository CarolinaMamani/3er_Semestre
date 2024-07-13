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
            mostrarMenu()
        }//fin de ciclo while
    }//fin del metodo main
}