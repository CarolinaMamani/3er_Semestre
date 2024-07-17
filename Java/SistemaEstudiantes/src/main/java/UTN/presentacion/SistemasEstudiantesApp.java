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
                //no muestra la informacion solo recupera la info y regresa una lista
                var estudiantes = estudianteDAO.listarEstudiantes();//recibe el listado
                //vamos a iterar cada objeto de tipo estudiante
                estudiantes.forEach(System.out::println);//para imprimir la lista
            }
            case 2->{
                System.out.println("Pasame el Id del profugo: ");
                var idEstudiante = Integer.parseInt(consola.nextLine());
                var estudiante = new Estudiante(idEstudiante);
                var encontrado = estudianteDAO.buscarEstudiantePorId(estudiante);
                if (encontrado)
                    System.out.println("Lo encontre! >)  "+estudiante);
                else
                    System.out.println("Se escapo! D: "+estudiante);
            }
            case 3->{
                System.out.println("Quies es el nuevo? ");
                System.out.println("Nombre: ");
                var nombre = consola.nextLine();
                System.out.println("Apellido: ");
                var apellido = consola.nextLine();
                System.out.println("Telefono: ");
                var telefono = consola.nextLine();
                System.out.println("Email: ");
                var email = consola.nextLine();
                //crar objeto estudiante sin id
                var estudiante = new Estudiante(nombre,apellido,telefono,email);
                var agregado = estudianteDAO.agregarEstudiante(estudiante);
                if (agregado)
                    System.out.println("Ya lo meti a la carcel :) "+estudiante);

            }
        }
    }

}// fin de clase