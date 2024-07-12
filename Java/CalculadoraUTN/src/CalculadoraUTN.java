import java.util.Scanner;

public class CalculadoraUTN {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //OBJETO DE ENTRADA
        System.out.println("******* Aplicacion Calculadora *******");
        System.out.print("Digite el valor de operando1: "); //println es para que se imprima con salto de linea
        var operando1 = Integer.parseInt(entrada.nextLine());
        System.out.print("Digite el valor de operando2: ");
        var operando2 = Integer.parseInt(entrada.nextLine());
        var resultado = operando1 + operando2;
        System.out.println("resultado = " + resultado);
    }
}
