
public class mundoPC {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13); // importar la clase
        Teclado tecladoHP = new Teclado("Bluetooth", "HP");
        Raton ratonHP = new Raton("Bluetooth", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);

        Monitor monitorGamer = new Monitor("Gamer", 32);
        Teclado tecladoGamer = new Teclado("Bluetooth", "LG");
        Raton ratonGamer = new Raton("USB", "Azus");
        Computadora computadoraGamer = new Computadora("Alien", monitorGamer, tecladoGamer, ratonGamer);
        // agragando elementos, solo podemos hasta 10
        Orden orden1 = new Orden(); // arreglo vacio
        Orden orden2 = new Orden(); // nueva lista para objeto orden2
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        orden1.mostrarOrden();

        Computadora computadorasVarias = new Computadora("Compus de diferentes marcas", monitorGamer, tecladoHP,
                ratonHP);
        orden2.agregarComputadora(computadorasVarias);
        orden2.mostrarOrden();
    }
}
