public class Orden {
    // agregamos atributos
    private final int idOrden;
    private Computadora computadora[]; // Arreglo de objetos
    private static int contadorOrdenes;
    private static final int MAX_COMPUTADORAS = 10; // Elementos maximos
    // contador de compus
    private int contadorComputadora;

    // constructor vacio
    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadora = new Computadora[Orden.MAX_COMPUTADORAS];
    }

    // metodo para agregar nueva compu al arreglo
    public void agregarComputadora(Computadora computadora) {
        if (this.contadorComputadora < Orden.MAX_COMPUTADORAS) { // verificamos el valor de compus y que no supere el
                                                                 // max
            this.computadora[this.contadorComputadora++] = computadora; // agregamos un elemento a nuestra variable
        } else {
            System.out.println("Has superado el limite: " + Orden.MAX_COMPUTADORAS);
        }

    }

    // Metodo mostrar Orden
    public void mostrarOrden() {
        System.out.println("Orden #: " + this.idOrden);
        System.out.println("Computadoras de la orden #: " + this.idOrden);
        for (int i = 0; i < this.contadorComputadora; i++) {
            System.out.println(this.computadora[i]);
        }
    }

}
