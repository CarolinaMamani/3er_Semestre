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
                mostrarMenu();
                //este sera el metodo que devolvera un booleano:
                salir = ejecutarOpciones(consola, estudianteDao);//este metodo arroja una excepcion
            } catch (Exception e){
                System.out.println("Error error se no se puede dar el menu"+ e.getMessage());
            }
        }//fin while

    }//fin main

    //Menu
    private static void mostrarMenu(){
        System.out.println("""
                <<<<<<<< SISTEMA DE ESTUDIANTES >>>>>>>
                1. Pasar lista
                2. Buscar
                3. Agregar mas ninios
                4. Modificar algun nino
                5. Aniquilar
                6. Exit
                
                Cual deseas mi reina? :D  
                """);
    }//fin metodo mostrar menu

//Metodo para ejecutar las opciones, va a regresar un valor boleano, ya que es el que puede modificar el valor de la
    //la variable salir, si es verdadero termina el ciclo while

    public static boolean ejecutarOpciones(Scanner consola, EstudianteDAO estudianteDAO){
        var opcion = Integer.parseInt(consola.nextLine());
        var salir = false;
        switch (opcion){
            case 1 ->{
                System.out.println("Tu lista es: ");
                
            }
            case 2->{
                System.out.println();
            }
        }
    }

}// fin de clase