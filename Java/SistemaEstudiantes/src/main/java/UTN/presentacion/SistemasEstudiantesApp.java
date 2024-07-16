package UTN.presentacion;

import UTN.conexion.Conexion;
import UTN.datos.EstudianteDAO;
import UTN.dominio.Estudiante;

import java.util.Scanner;

public class SistemasEstudiantesApp {
    public static void main(String[] args) {
        var salir = false;
        var consola = new Scanner(System.in); // para leer informacion de la consola
        //se crea una instancia de la clase  servicio, esto lo hacemos fuera el ciclo
        var estudianteDao = new EstudianteDAO();//Esta instancia debe hacerse una vez
        while(!salir){
            try{
                mostrarMenu(); //este sera el metodo que devolvera un booleano
                salir = ejecutarOpciones(consola, estudianteDao);//este metodo arroja una excepcion
            } catch (Exception e){
                System.out.println("Error error se no se puede dar el menu"+ e.getMessage());
            }
        }//fin while

    }//fin main
}// fin de clase