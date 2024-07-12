import java.util.Scanner;

public class CalculadoraUTN {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //OBJETO DE ENTRADA
        System.out.println("******* Aplicacion Calculadora *******");

        //Mostramos el menu
        System.out.println("""
                1. Suma
                2. Resta
                3. Multiplicacion
                4. Division
                5. Salir
                """);
        System.out.print("Operacion a realizar? ");
        var operacion = Integer.parseInt(entrada.nextLine()); //lee el tipo de operacion que eligio el usuario

        //Ciclo condicional con rango
        if(operacion >=1 && operacion <=4){
            System.out.print("Digite el valor de operando1: "); //println es para que se imprima con salto de linea
            var operando1 = Integer.parseInt(entrada.nextLine());

            System.out.print("Digite el valor de operando2: ");
            var operando2 = Integer.parseInt(entrada.nextLine());

        }
    }
}
