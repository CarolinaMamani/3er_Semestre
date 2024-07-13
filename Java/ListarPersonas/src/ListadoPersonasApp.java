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
        var opcion = Integer.parseInt(entrada.nextLine());//recibimos la info que nos pasa el usuario
        var salir = false;
        //Revisamos la opcion degitada a traves de un switch
        switch (opcion){
            case 1 -> {//agregar una persona a la lista
                System.out.print("Nombre: ");
                var nombre = entrada.nextLine();
                System.out.print("Telefono: ");
                var tel = entrada.nextLine();
                System.out.print("Email: ");
                var email = entrada.nextLine();
                //creamos el objeto persona
                var persona = new Persona(nombre, tel, email);
                //agregamos la persona a la lista
                personas.add(persona);
                System.out.println("Tienes  "+personas.size()+"persona tuyas uwu");
            }
        }


    }//fin del metodo ejecutarOperacion

}//fin clase listadopersonas